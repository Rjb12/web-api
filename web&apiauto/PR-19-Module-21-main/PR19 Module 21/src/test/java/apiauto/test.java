package apiauto;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class test {
    private static RequestSpecification req;
    private static Response res;

    // Tes Positif: Uji API untuk login dengan kredensial yang benar
    @Test
    public void testValidLogin() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");

        // Mengirimkan permintaan POST untuk login
        res = req.body("{ \"username\": \"standard_user\", \"password\": \"secret_sauce\" }")
                .post("https://www.saucedemo.com/api/login"); // Pastikan endpoint ini benar

        // Memeriksa kode status 200 OK
        assertEquals(res.getStatusCode(), 200);

        // Memeriksa apakah response berisi token atau detail yang diharapkan
        String responseBody = res.getBody().asString();
        assertTrue(responseBody.contains("token") || responseBody.contains("logged_in"), "Response does not contain expected fields.");
    }

    // Tes Negatif: Uji API untuk login dengan kredensial yang salah
    @Test
    public void testInvalidLogin() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");

        // Mengirimkan permintaan POST dengan kredensial yang salah
        res = req.body("{ \"username\": \"invalid_user\", \"password\": \"wrong_password\" }")
                .post("https://www.saucedemo.com/api/login"); // Pastikan endpoint ini benar

        // Memeriksa kode status 401 Unauthorized
        assertEquals(res.getStatusCode(), 401);

        // Memeriksa pesan kesalahan atau detail yang diharapkan
        assertTrue(res.jsonPath().getString("error").contains("invalid credentials"), "Error message not as expected.");
    }

    // Tes Positif: Uji API untuk mendapatkan daftar produk
    @Test
    public void testGetProductList() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");

        // Mengirimkan permintaan GET untuk mendapatkan daftar produk
        res = req.get("https://www.saucedemo.com/api/products"); // Pastikan endpoint ini benar

        // Memeriksa kode status 200 OK
        assertEquals(res.getStatusCode(), 200);

        // Memeriksa apakah response berisi daftar produk
        assertTrue(res.jsonPath().getList("products").size() > 0, "Product list is empty.");
    }

    // Tes Positif: Uji API untuk mendapatkan detail produk tertentu
    @Test
    public void testGetProductDetails() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");

        // Mengirimkan permintaan GET untuk mendapatkan detail produk dengan ID tertentu
        res = req.get("https://www.saucedemo.com/api/products/1"); // Pastikan endpoint ini benar

        // Memeriksa kode status 200 OK
        assertEquals(res.getStatusCode(), 200);

        // Memeriksa apakah respons berisi detail produk yang diharapkan
        assertTrue(res.jsonPath().getString("id").equals("1"), "Product details not as expected.");
    }
}
