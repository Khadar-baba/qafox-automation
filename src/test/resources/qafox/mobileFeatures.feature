Feature: Mobile functionality of Qafox

  @Risk
  Scenario: verify use can able to see the mobile Features
    Given I am on the Qafox login page
    And I given the valid email id and password
    And I view the accountPage
    And I am on the phones & PDs page
    When I see the mobiles and i select the mobile
    Then I see the description of the mobile
