Feature: Delete Product
As a Cashier, I can delete product

  @tag1
  Scenario: Delete Product Valid
    Given Cashier telah login dan berada pada halaman dashbord Qbills
    When Cashier click manage product feature
    And Click icon gambar sampah pada product yang akan dihapus
    And click Delete Confirmation
    Then Produk berhasil terhapus