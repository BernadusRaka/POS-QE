@AddIncreaseStock
  Feature: Increase Stock

    Scenario: User menambahkan stok produk dengan input yang valid
      Given User mengatur endpoint yang valid untuk menambah stok produk dengan ID
      When User mengisikan jumlah stok di body
      And User mengirimkan request untuk menambah jumlah stok produk
      Then API merespons dengan kode status 201 created
      And Response memunculkan data stok produk sesuai dengan ID yang diminta yang bertambah

    Scenario: User tidak bisa menambah stok produk tanpa meng-input jumlah stok
      Given User mengatur Endpoint untuk menambahkan stok produk dengan ID yang tersedia
      When User mengosongi input jumlah stock di body
      And User mengirimkan request untuk menambha stok produk
      Then API merespons dengan status kode 400