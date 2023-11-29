@GetProductByID
Feature: Get Product Type By ID

  Background:
  Given Admin mengatur API Endpoint untuk mendapatkan tipe produk berdasarkan id

Scenario: Admin berhasil mendapatkan informasi tipe produk berdasarkan ID
  When Admin mengakses endpoint untuk mendapatkan informasi tipe produk berdasarkan ID
  Then sistem seharusnya memberikan respons dengan status kode 200
  And sistem seharusnya menampilkan informasi lengkap tentang tipe produk tersebut

#Scenario: Admin Unauthorized access tanpa token ingin mendapatkan informasi tipe produk berdasarkan ID
#When pengguna mencoba mengakses endpoint untuk mendapatkan informasi tipe produk by ID tanpa token
#Then sistem seharusnya memberikan respon status 401 Unauthorized
#And sistem seharusnya menampilkan pesan kesalahan

Scenario: Admin mencoba mendapatkan tipe produk dengan ID yang tidak valid
  When Admin mengakses endpoint untuk mendapatkan informasi tipe produk dengan ID yang tidak tersedia
  Then sistem seharusnya memberikan respons dengan status kode 404
  And sistem seharusnya menampilkan pesan kesalahan untuk produk yang tidak ditemukan