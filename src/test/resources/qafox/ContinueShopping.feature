 Feature: Write Review functionality
 @Retest
  Scenario: verify use can able to write review in review fields
    Given I am on the Qafox login page
    And I given the valid email id and password
    And I view the accountPage
    And I am on the phones & PDs page
    And I see the mobiles and i select the mobile
    And I see the description of the mobile
    And I select click the mandatory fields
    And I display the check out field
    And I give the quality and taxs field
    And I display the continue Shopping field
    When I select the MacBook system
    Then I display the checkout field
 