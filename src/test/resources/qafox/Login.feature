Feature: Login functionality of Qafox

  @Test
  Scenario: verify use can able to login sucessful
    Given I am on the Qafox login page
    When I given the valid email id and password
    Then I view the accountPage
