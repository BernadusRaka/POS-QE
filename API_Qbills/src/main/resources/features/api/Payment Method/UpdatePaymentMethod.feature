Feature: Update Payment Method

  Background:
    Given Admin mengakses menggunakan endpoint yang valid untuk Update Payment Method

Scenario:
  When Admin send request untuk Update Payment Method
  Then Muncul status code 200
  And Update Payment Method sukses

Scenario:
  When Admin send request untuk update payment method menggunakan ID yang invalid
  Then Muncul status code 400
  And Update Payment Method gagal