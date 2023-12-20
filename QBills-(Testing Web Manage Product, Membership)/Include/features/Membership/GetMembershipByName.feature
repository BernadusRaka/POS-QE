@tag
Feature: Get Membership By Name
  As a Cashier I want to get membership by name 

  @tag1
  Scenario: Get Membership Valid
    Given Open web Qbills untuk login get membership
    When cashier memasukkan username dan password yang valid untuk get membership
    And click login button untuk get membership
    And Pada halaman dashboard pilih fitur membership untuk melihat semua membership
    And Pada search bar ketik nama membership yang ingin dicari
    Then Nama membership yang dicari akan muncul

  @tag2
  Scenario: Get Membership With Wrong Name 
  	Given Open web Qbills untuk login get membership
    When cashier memasukkan username dan password yang valid untuk get membership
    And click login button untuk get membership
    And Pada halaman dashboard pilih fitur membership untuk melihat semua membership
    And Pada search bar ketik nama membership invalid yang ingin dicari
    Then Nama membership tidak muncul karena tidak ada