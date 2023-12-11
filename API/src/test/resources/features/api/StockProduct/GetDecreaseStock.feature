@GetDecreaseStock
  Feature: Get Decrease Stock

    Scenario: User dapat melihat pengurangan stok produk dengan endpoint yang valid
      Given User mengatur Endpoint yang valid dengan method GET untuk melihat seluruh data pengurangan stok produk yang tersedia
      When User mengirimkan request
      Then API merespons dengan status code 200 ok
      And Seluruh data pengurangan produk muncul sebagai respons

    Scenario: User tidak dapat meminta seluruh data stok produk yang berkurang dengan endpoint yang invalid
      Given User mengatur endpoint yang invalid untuk melihat seluruh data pengurangan stok
      When User mengirimkan request untuk melihat seluruh data pengurangan stok
      Then API memberikan respons dengan status code 400 bad request


