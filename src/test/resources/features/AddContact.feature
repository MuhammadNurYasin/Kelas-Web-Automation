Feature: add contact in my jurnal

  @add-contact
  Scenario: success create contact
    Given I already logged in
    When I click contact menu
    Then contact page appear
    When I click new contact
    Then create new contact page appear
    When I fill name with "Yasin"
    And I choose contact type as customer
    And I choose title for the name as Mr
    And I fill first name with "Muhammad"
    And I fill middle name with "Nur"
    And I fill last name with "Yasin"
    And I fill phone number with "081234567890"
    And I fill identity number with "112233445566"
    And I fill email name with "yasin123@gmail.com"
    And I click dropdown button in List of Bank
    And I fill bank branch with "Makassar"
    And I fill bank holder name with "muhnuryasin"
    And I fill account number with "0102030405"
    And I click add button
    Then contact with name "Yasin" is created