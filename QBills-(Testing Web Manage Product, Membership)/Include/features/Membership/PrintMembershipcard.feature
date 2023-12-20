@tag
Feature: View Membership Card
As a Cashier, I want to see membership card

  @tag1
  Scenario: View Membership Valid
    Given Open QBillss Web to view membership card
    When Login dengan username dan password yang valid
    And Click tombol login pada login page
    And Pada halaman dashboard click fitur membership untuk view membership card
    And Pada halaman membership click icon pencil untuk view membership card
    And Click View Card
    Then Membership Card berhasil ditampilkan
