# Kerangka Pengujian Otomatis Web

Repository ini berisi pengujian otomatis untuk aplikasi web menggunakan skenario yang disediakan. Pengujian dirancang untuk memverifikasi fungsionalitas aplikasi web dalam berbagai skenario.

## Skenario yang Dicakup

### Pengujian Positif:

1. **Pengujian Login Normal**:
   - Memverifikasi login berhasil menggunakan username dan password yang valid.
   - Memastikan bahwa ikon keranjang belanja ditampilkan setelah login.

2. **Pengujian Tambah Item ke Keranjang**:
   - Memverifikasi bahwa pengguna dapat menambahkan item ke keranjang belanja setelah login berhasil.
   - Memeriksa bahwa jumlah item di keranjang sesuai dengan yang diharapkan.

3. **Pengujian Urutkan Harga Tinggi ke Rendah**:
   - Memverifikasi bahwa pengguna dapat mengurutkan item dari harga tertinggi ke terendah setelah login berhasil.
   - Memastikan bahwa daftar item diurutkan sesuai dengan yang diharapkan.

4. **Pengujian Urutkan Z ke A**:
   - Memverifikasi bahwa pengguna dapat mengurutkan item dari Z ke A setelah login berhasil.
   - Memastikan bahwa daftar item diurutkan sesuai dengan yang diharapkan.

### Pengujian Negatif:

1. **Pengujian Login Pengguna Terkunci**:
   - Memverifikasi bahwa pengguna tidak dapat login ketika akun pengguna terkunci.
   - Memeriksa pesan kesalahan yang ditampilkan setelah mencoba login dengan akun terkunci.

2. **Pengujian Login Password Salah**:
   - Memverifikasi bahwa pengguna tidak dapat login dengan menggunakan kata sandi yang salah.
   - Memeriksa pesan kesalahan yang muncul setelah mencoba login dengan kata sandi yang salah.

### Pengujian boundaries:

1. **Pengujian Batas Tambah Item**:
   - Memverifikasi bahwa pengguna tidak dapat menambahkan lebih dari jumlah maksimum item ke keranjang belanja.
   - Memeriksa apakah aplikasi memberikan pesan atau tindakan yang sesuai ketika batas item tercapai.

2. **Pengujian Hapus Item dari Keranjang**:
   - Memverifikasi bahwa pengguna dapat menghapus item dari keranjang belanja.
   - Memeriksa apakah jumlah item di keranjang belanja berkurang setelah menghapus item.
