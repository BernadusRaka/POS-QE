@tag
Feature: Add A Product
As a cashier, I can add new product
  

  @tag1
  Scenario: Add A Product Valid
    Given Cashier telah login dan berada pada halaman dashboard
    When Pada halaman dashboard click fitur manage product
    And Pilih Add Product
    And Masukkan data-data produk tanpa ada satupun yang kosong
    And Click save
    Then Produk baru berhasil ditambahkan
