@GetAllStock
  Feature: Get All Stock

    Scenario: User mencoba mendapatkan semua data stock produk dengan endpoint valid
      Given User mengatur endpoint yang valid untuk mendapatkan semua data stok produk
      When User mengirim request untuk mendapatkan data
      Then API merespons dengan kode status 200 ok
      And Respons berisi data seluruh stok produk muncul

    Scenario: User tidak bisa mendapatkan semua data stock produk dengan endpoint tidak valid
      Given User mengatur endpoint yang tidak valid
      When User mengirim request
      Then API merespon dengan status code 404