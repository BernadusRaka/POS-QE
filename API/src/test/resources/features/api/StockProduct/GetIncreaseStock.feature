@GetIncreaseStock
  Feature: Get Increase Stock

    Scenario: User dapat melihat peningkatan stok produk dengan endpoint yang valid
      Given User mengatur Endpoint yang valid dengan method GET untuk melihat seluruh data penambahan stok produk yang tersedia
      When User mengirimkan request
      Then API merespons dengan status code 200 ok
      And Seluruh data penambahan produk muncul di respon

    Scenario: User tidak dapat meminta seluruh data penambahan stok produk yang tersedia dengan endpoint yang invalid
      Given User mengatur endpoint yang invalid untuk melihat seluruh data penambahan stok
      When User mengirimkan request untuk melihat seluruh data penambahan stok
      Then API memberikan respons dengan status code 400 bad request