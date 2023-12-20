@tag
Feature: Get report

  @tag1
  Scenario: Get report
    Given cashier login dan berada pada halaman dashboard
    When Cashier memilih fitur report
    And Pilih bulan yang akan ditampilkan reportnya
    Then Report per bulan yang diinginkan berhasil ditampilkan
