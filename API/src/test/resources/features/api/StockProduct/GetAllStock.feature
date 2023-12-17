@GetAllStock
  Feature: Get All Stock

    Scenario: User mencoba mendapatkan semua data stock produk dengan endpoint valid
      Given User mengatur endpoint yang valid untuk mendapatkan semua data stok produk
      When User mengirim request untuk mendapatkan data
      Then sistem seharusnya memberikan respons dengan status kode 200
      And Respons berisi data seluruh stok produk muncul
