@SmokeTest
@HomePageTestScenario
Feature: F03_Authentication | Login required to display specific data

  Scenario: Verify that you cannot see “Your Orders” page if you are not logged in
    When Hover on Hello, sign in Account & Lists
    And CLick on Your orders
    Then login page displayed

  Scenario: Verify that you cannot see “Your Addresses” page if you are not logged in
    When Hover on Hello, sign in Account & Lists
    And CLick on Your Addresses
    Then login page displayed

  Scenario: Verify that you can see “Your Lists” intro screen if you are not logged in
    When Hover on Hello, sign in Account & Lists
    And CLick on Your Lists
    Then List intro displayed