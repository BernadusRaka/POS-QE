@tag
Feature: Edit Membership Data
As A Cashier I want to edit the membership data

  @tag1
  Scenario: Edit Data Membership Valid
    Given Open QBillss Web to edit membership
    When Login menggunakan username dan password yang valid
    And Click tombol login
    And Pada halaman dashboard click fitur membership
    And Pada halaman membership click icon pencil untuk mengedit membership
    And Ubah data memebrship
    And Click Save
    Then Data sudah berhasil dirubah

  @tag2
  Scenario: Edit Data Membership with no data
 		Given Open QBillss Web to edit membership
    When Login menggunakan username dan password yang valid
    And Click tombol login
    And Pada halaman dashboard click fitur membership
    And Pada halaman membership click icon pencil untuk mengedit membership
    And Ubah data membership tanpa memasukkan data
    And Click Save
    Then Data gagal untuk diubah