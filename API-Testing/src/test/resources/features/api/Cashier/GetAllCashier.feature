@GetAllCashier
Feature:  Get All Cashier

  Scenario: Sebagai admin saya ingin mendapatkan semua data Kasir
    Given Admin mengakses endpoint untuk mendapatkan semua Kasir
    When Admin mengirim request untuk mendapatkan semua kasir
    Then sistem seharusnya memberikan respons dengan status kode 200
    And sistem seharusnya menampilkan daftar semua Kasir yang tersedia

#  Scenario: Admin Unauthorized access tanpa token ingin mendapatkan semua data kasir
#    Given Admin tidak terotentikasi dengan token
#    When pengguna mencoba mengakses endpoint untuk mendapatkan semua Cashier tanpa token
#    Then sistem seharusnya memberikan respon status 401 Unauthorized

