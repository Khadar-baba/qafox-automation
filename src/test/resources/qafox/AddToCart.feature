Feature: Add to cart functionality
@Adhoc

  Scenario: verify use can able to do add to cart mobile
    Given I am on the Qafox login page
    And I given the valid email id and password
    And I view the accountPage
    And I am on the phones & PDs page
    And I see the mobiles and i select the mobile
    And I see the description of the mobile
    When I select click the mandatory fields
    Then I display the check out field
