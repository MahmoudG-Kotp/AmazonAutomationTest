@SmokeTest
@HomePageTestScenario
Feature: F02_Cart | Add product to cart

  Scenario: Verify that items are added to cart correctly
    When Click on All tab
    And Go to Today's Deals
    * Click on the second Category
    * Click on the first product on this category
    * Click on the second item in this product
    * Let quantity equals two
    * Press add to cart button
    * Navigate to the cart page
    Then Correct items are added to the cart
