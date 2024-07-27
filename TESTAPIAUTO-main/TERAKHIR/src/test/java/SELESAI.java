package apiauto;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SELESAI {
    private static RequestSpecification req;
    private static Response res;

    // Tes Positif: Uji API untuk respons yang benar dengan input yang benar
    @Test
    public void testPositiveScenario() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "a9ab86a5c83e50d29b5fd81d01c55dcff6683b3a1bbeda671cf00bf1ceea936b");
        res = req.get("https://gorest.co.in/public/v2/users");

        // Memeriksa kode status 200 OK
        assertEquals(res.getStatusCode(), 200);
        // Menambahkan lebih banyak asserstion sesuai kebutuhan
    }

    // Tes Negatif: Uji API untuk respons yang salah dengan input yang salah
    @Test
    public void testNegativeScenario() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "a9ab86a5c83e50d29b5fd81d01c55dcff6683b3a1bbeda671cf00bf1ceea936b");
        res = req.get("https://gorest.co.in/public/v2/users10"); // ID yang tidak valid

        // Memeriksa kode status 404 Not Found atau sesuai dengan kebutuhan
        assertTrue(res.getStatusCode() == 404 || res.getStatusCode() == 400);
        // Menambahkan lebih banyak asserstion sesuai kebutuhan
    }

    // Tes Batas: Uji API untuk edge cases yang berbeda
    @Test
    public void testBoundaryScenario() {
        req = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "a9ab86a5c83e50d29b5fd81d01c55dcff6683b3a1bbeda671cf00bf1ceea936b");
        res = req.get("https://gorest.co.in/public/v2/users"); // Meminta banyak data

        // Memeriksa kode status 200 OK
        assertEquals(res.getStatusCode(), 200);
        // Memeriksa apakah jumlah pengguna tidak melebihi batas (misalnya, 1000)
        assertTrue(res.jsonPath().getList("data").size() <= 1000);
        // Menambahkan lebih banyak asserstion sesuai kebutuhan
    }
}
