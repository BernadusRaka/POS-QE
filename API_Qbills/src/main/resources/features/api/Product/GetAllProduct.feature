Feature: Get All product

  Background:
    Given Admin memasukkan endpoint untuk Get All Product

Scenario: Admin mencoba Get All Product dengan valid
  When Admin send request untuk Get All Product
  Then Muncul status code 200
  And Semua data produk berhasil ditampilkan

Scenario: Admin access tanpa autentikasi
  When Admin send request Get All product tanpa autentikasi
  Then Muncul status code 401
  And Admin gagal mendapat semua data produk