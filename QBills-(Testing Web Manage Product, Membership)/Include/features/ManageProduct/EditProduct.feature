@tag
Feature: Edit Product
  As a cashier, i want to edit product

  @tag1
  Scenario: Edit Product
    Given Cashier login dan berada pada halaman dashboard
    When Cashier click fitur manage product untuk edit product
    And Click icon pen pada product yang akan di edit 
    And Ubah bagian yang ingin diedit
    And Click save button
    Then Produk berhasil diedit