@AddDecreaseStock
  Feature: Decrease Stock

Scenario: User mengurangi jumlah stok produk
  Given User mengatur Endpoint yang valid dengan ID yang tersedia
  When User mengirimkan request untuk mengurangi jumlah stok produk
  Then sistem seharusnya memberikan respons dengan status kode 200



  Scenario: User tidak bisa mengurangi stok produk dengan input yang kosong
  Given User mengatur Endpoint yang valid dengan ID yang tersedia
  When User mengirimkan request untuk mengurangi jumlah stok produk tanpa mengisi body
  Then sistem seharusnya memberikan respons dengan status kode 400



