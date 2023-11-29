@GetCashierByID
Feature: Get Cashier By ID

  Scenario: Admin ingin mendapatkan data kasir berdasarkan ID
    Given Admin mengakses endpoint untuk mendapatkan data kasir berdasarkan ID
    When Admin mengirim request untuk mendapatkan kasir berdasarkan ID
    Then sistem seharusnya memberikan respons dengan status kode 200
    And sistem seharusnya menampilkan informasi lengkap mengenai kasir tersebut

#  Scenario: Admin Unauthorized access tanpa token ingin mendapatkan data kasir
#    Given pengguna mencoba mengakses endpoint untuk mendapatkan data Cashier berdasarkan ID tanpa token
#    When sistem seharusnya memberikan respon status 401 Unauthorized
#    Then sistem seharusnya menampilkan pesan kesalahan

  Scenario: Admin mencoba mendapatkan data dengan ID yang tidak valid
    When Admin mengirim request untuk mendapatkan kasir berdasarkan ID yang tidak valid
    Then sistem seharusnya memberikan respons dengan status kode 404
    And sistem seharusnya menampilkan pesan kesalahan untuk kasir tidak ditemukan




