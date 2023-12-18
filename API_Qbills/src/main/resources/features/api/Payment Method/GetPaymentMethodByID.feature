Feature: Get Payment Method By ID

  Background:
    Given Admin mengakses menggunakan endpoint yang valid untuk Get Payment Method By ID

Scenario:
  When Admin send request untuk Get All Payment Method By ID
  Then Muncul status code 200
  And Semua Payment Method berhasil ditampilkan

Scenario:
  When Admin send request menggunakan ID yang salah pada Get Payment Method by ID
  Then Muncul status code 404
  And Payment Method sesuai ID gagal ditampilkan