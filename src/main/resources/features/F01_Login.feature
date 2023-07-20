@SmokeTest
@HomePageTestScenario
Feature: F01_Login | Login to non-existing account

  Scenario: Verify that user cannot login with valid but not registered email
    Given Navigate to the login page
    When User enter data "dummy_email@yahoo.com" as email
    And Continue button clicked
    Then Login not proceeding due to the non-existence of the account
