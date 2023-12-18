Feature: Add Product

  Background:
    Given Admin mengakses endpoint untuk menambahkan produk

Scenario: Admin berhasil menambahkan produk
  When Admin send request dengan method PUT untuk menambahkan produk
  Then Muncul status code 201
  And Produk berhasil ditambahkan

Scenario: Menambahkan produk dengan informasi yang tidak lengkap
  When Admin memasukkan informasi yang tidak lengkap
  Then Admin send request dengan method PUT untuk menambahkan produk
  And Muncul status code 400