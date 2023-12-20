@tag
Feature: Delete Membership
	As a Cashier i want to delete the membership
	
  @tag1
  Scenario: Membership page
  	Given Open web Qbills untuk login
    When cashier memasukkan username dan password yang valid
    And click login button
    And Pada halaman dashboard pilih fitur membership
    And click button centang pada membership yang ingin dihapus
    And click delete
    And pada box delete confirmation click delete
    Then membership berhasil dihapus
    