
@CreateAccount
Feature: Create Account Cashier

Scenario Outline: Admin berhasil menambahkan account baru
Given Admin masuk ke halaman manage account
When Admin klik add account buttton
And Admin mengisi Fullname<fullname>, username<username>, dan password<password> yang valid
And Admin klik save button
Then Muncul pesan berhasil menambahkan account

Examples:
|fullname|username|password|
|Akun Kasir|Kasir|12345678|

Scenario: Admin tidak dapat menambahkan account baru dengan input data kosong
Given Admin masuk ke halaman manage account
When Admin klik add account buttton
And Admin klik save button
Then Muncul pesan error

Scenario Outline: Admin tidak dapat menambahkan data account yang sudah ada
Given Admin masuk ke halaman manage account
When Admin klik add account buttton
And Admin mengisi Fullname<fullname>, username<username>, dan password<password> yang sudah ada
And Admin klik save button
Then Muncul pesan error
  
Examples:
|fullname|username|password|
|QECapstone|RakaQE|12345678|
  