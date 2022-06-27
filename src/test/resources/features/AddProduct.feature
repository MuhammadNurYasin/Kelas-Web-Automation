Feature: add product in my jurnal

  @add-product
  Scenario: success create product
    Given I already logged in
    When I click product menu
    Then product page appear
    When I click action menu
    And I choose new product
    Then create new product page appear
    When I fill product name with "ASUS Vivobook"
    And I fill product code with "X442UR"
    And I fill product category with "Elektronik"
    And I fill product description with "ASUS Vivobook 13.3 Inch 8 GB 3.10Ghz, Black with Intel HD Graphics."
    And I choose product type as Single
    And I fill buy unit price with "14000000"
    And I choose default buy tax as PPN
    And I fill sale unit price with "16000000"
    And I choose default sell tax as PPN
    And I activate track stock button
    And I fill minimum stock quantity with 5
    And I click create product button
    Then product with name "ASUS Vivobook" is created
    And product with code "X442UR" is created
    And product with category "Elektronik" is created
    And product with description "ASUS Vivobook 13.3 Inch 8 GB 3.10Ghz, Black with Intel HD Graphics." is created
    And product with buy price "Rp. 14.000.000,00" is created
    And product with sell price "Rp. 16.000.000,00" is created
    And product with minimum stock "5 Pcs" is created


