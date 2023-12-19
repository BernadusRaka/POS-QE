@tag
Feature: Get Product By Name 
As a cashier, i can get product by name 

  @tag1
  Scenario: Get Product By Name
    Given Cashier login dan berada pada halaman dashboard Qbills
    When Cashier click fitur manage product
    And Pada search bar, cashier menuliskan produk sesuai nama 
    Then Produk sesuai nama berhasil ditampilkan
