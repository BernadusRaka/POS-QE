
@UpdateAccount
Feature: Update Data Account

 
  Scenario: Admin berhasil memperbarui data account
Given Admin masuk ke halaman manage account
When Admin klik update button pada kolom account
And Admin mengisi form dengan data baru
And Admin klik save
Then Data Account di tabel diperbarui