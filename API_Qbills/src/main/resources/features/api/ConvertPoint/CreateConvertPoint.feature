Feature: Create Convert Point

  Background:
    Given Admin mengakses endpoint untuk membuat convert point dengan valid

Scenario: Admin berhasil membuat convert point
  When Admin send request untuk membuat convert point dengan valid
  Then Muncul status code 201
  And Convert Point baru berhasil dibuat

Scenario: Admin mengakses dengan endpoint yang invalid
  Given Admin akses dengan endpoint yang invalid untuk membuat convert point
  When Admin send request untuk membuat convert point yang invalid
  Then Muncul status code 400
  And Convert Point baru gagal dibuat