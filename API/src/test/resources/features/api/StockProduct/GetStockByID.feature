@GetStockByID
  Feature: Get Stock By ID

    Scenario: User mencoba mendapatkan data stok produk berdasarkan ID
      Given User mengatur endpoint dengan ID yang tersedia
      When User mengirim request untuk melihat data stok produk berdasarkan ID
      Then API merespon dengan status code 200 ok
      And Data stok produk dengan ID yang diminta muncul

    Scenario: User tidak bisa mendaptkan data stok produk dengan ID yang tidak tersedia
      Given User mengatur endpoint dengan ID yang tidak tersedia untuk meminta data stok produk
      When User mengirim request untuk meminta data stok produk
      Then API merespon dengan status code 404
