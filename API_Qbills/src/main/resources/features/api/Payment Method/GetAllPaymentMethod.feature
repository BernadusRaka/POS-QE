Feature: Get All Payment Method

  Background:
    Given Admin mengakses menggunakan endpoint yang valid untuk Get All Payment Method

Scenario:
  When Admin send request untuk Get All Payment Method
  Then Muncul status code 200
  And Semua Payment Method berhasil ditampilkan

Scenario:
  When Admin send request Get All Payment Method tanpa autentikasi
  Then Muncul status code 401
  And Semua Payment method gagal ditampilkan

