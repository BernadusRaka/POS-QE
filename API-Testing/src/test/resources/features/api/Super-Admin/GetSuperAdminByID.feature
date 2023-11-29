@GetSuperAdminByID
Feature: Get Super Admin By ID

  Scenario: Super Admin berhasil mendapatkan data admin yang valid
    Given terdapat Super Admin dengan ID yang valid
    When Super Admin melakukan permintaan untuk mendapatkan data dirinya sendiri dengan menggunakan ID tersebut
    Then sistem seharusnya memberikan respons dengan status kode 200
    And sistem seharusnya menampilkan data Super Admin yang sesuai dengan ID yang diminta

  Scenario: Super Admin mencoba mendapatkan data dengan ID yang tidak valid
    Given terdapat Super Admin dengan ID yang tidak valid
    When Super Admin melakukan permintaan untuk mendapatkan data Super Admin dengan menggunakan ID yang tidak valid
    Then sistem seharusnya memberikan respons dengan status kode 404
    And sistem seharusnya menampilkan pesan kesalahan yang mengindikasikan bahwa Super Admin dengan ID tersebut tidak ditemukan

  Scenario: Super Admin mencoba mendapatkan data dengan ID yang tidak ada
    Given terdapat Super Admin dengan ID yang tidak ada dalam sistem
    When Super Admin melakukan permintaan untuk mendapatkan data Super Admin dengan menggunakan ID yang tidak ada
    Then sistem seharusnya memberikan respons dengan status kode 404
    And sistem seharusnya menampilkan pesan kesalahan yang mengindikasikan bahwa Super Admin dengan ID tersebut tidak ditemukan
