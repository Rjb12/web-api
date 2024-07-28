Tujuan Kode di Kelas pages.WebPage
Kelas WebPage bertujuan untuk mengotomatisasi interaksi dengan elemen-elemen di situs web saucedemo.com menggunakan Selenium WebDriver. Berikut adalah penjelasan mengenai tujuan dari setiap bagian kode:

Deklarasi Locator (By Elements)

Tujuan: Menyimpan locator untuk elemen-elemen web yang akan diinteraksi, seperti input username, password, tombol login, ikon keranjang, dll.
Metode goToLoginPage()

Tujuan: Mengarahkan driver ke halaman login situs saucedemo.com.
Metode inputUsername(String username)

Tujuan: Mengisi kolom username dengan nilai yang diberikan.
Metode inputPassword(String pwd)

Tujuan: Mengisi kolom password dengan nilai yang diberikan.
Metode clickBtnLogin()

Tujuan: Mengklik tombol login untuk mencoba masuk ke akun.
Metode verifyIconCart()

Tujuan: Memastikan bahwa ikon keranjang belanja terlihat di halaman.
Metode verifyErrMsg(String errMsg)

Tujuan: Memastikan bahwa pesan kesalahan yang diberikan muncul di halaman.
Metode itemAddToCart()

Tujuan: Menambahkan item pertama ke dalam keranjang belanja.
Metode itemRemoveToCart()

Tujuan: Menghapus item pertama dari keranjang belanja.
Metode verifyItemCart(String itemExpected)

Tujuan: Memverifikasi jumlah item dalam keranjang sesuai dengan yang diharapkan.
Metode clickSortItemHighToLow()

Tujuan: Mengurutkan item berdasarkan harga dari tinggi ke rendah dan memverifikasi perubahan urutan.
Metode clickSortItemZtoA()

Tujuan: Mengurutkan item berdasarkan abjad dari Z ke A dan memverifikasi perubahan urutan.
Cara Build Proyek di IntelliJ IDEA dengan Gradle
Membuat Proyek Baru

Tujuan: Membuat proyek dengan struktur dan konfigurasi yang tepat.
Langkah-langkah:
Pilih "New Project" di IntelliJ IDEA.
Pilih "Gradle" dan "Java".
Isi nama proyek dan pilih direktori penyimpanan.
Mengonfigurasi build.gradle

Tujuan: Menentukan dependensi, plugin, dan konfigurasi build.
Langkah-langkah:
Tambahkan dependensi Selenium, AssertJ, dan lainnya di bagian dependencies.
Konfigurasikan penggunaan TestNG atau framework lain jika diperlukan.
Mengimpor Proyek ke IntelliJ IDEA

Tujuan: Mengimpor proyek dan mengunduh semua dependensi.
Langkah-langkah:
Sinkronisasi proyek dengan Gradle.
Menulis Kode

Tujuan: Mengimplementasikan logika aplikasi atau tes.
Langkah-langkah:
Buat paket dan kelas, lalu tulis kode tes atau fungsionalitas lainnya.
Menjalankan Pengujian

Tujuan: Memverifikasi bahwa kode bekerja dengan benar.
Langkah-langkah:
Jalankan pengujian melalui IntelliJ IDEA atau terminal.
Membuat dan Menjalankan Build

Tujuan: Mengemas aplikasi dan mengotomatiskan pengujian.
Langkah-langkah:
Jalankan task build dari IntelliJ IDEA atau terminal (./gradlew build).
Memeriksa Hasil Build dan Pengujian

Tujuan: Memastikan semua pengujian lulus dan build berhasil.
Langkah-langkah:
Tinjau hasil pengujian dan perbaiki jika ada masalah.
Proses ini memastikan bahwa elemen-elemen di situs web diuji dengan benar dan kode diuji untuk stabilitas dan fungsionalitas, yang sangat penting untuk mengembangkan aplikasi web yang andal.
