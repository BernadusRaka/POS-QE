
@DeleteAccount
Feature: Dlete Account Cashier

Scenario: Admin berhasil menghapus banyak data sekaligus
Given Admin masuk ke halaman manage account
When Admin klik checkbox dari account yang ingin dihapus
And Admin klik delete button
Then Muncul notifikasi berhasil menghapus account
 Scenario: Admin berhasil menghapus sebuah account
 Given Admin masuk ke halaman manage account
When Admin klik tombol tempat sampah di tabel account
And Admin klik delete di pesan konfirmasi
Then Muncul notifikasi berhasil menghapus account
 