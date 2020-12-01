Feature: Viewing and Purchasing Products from the Inventory

  Background: As a User I visit the Swag Labs Website
    Given I visit the Login Page

  Scenario: As a User I should be able to view and sort the Inventory, and make purchases
    Given I log in with username "standard_user" and password "secret_sauce"
    And I sort the Inventory from Lowest to Highest Price
    Then the Inventory will be sorted from Lowest to Highest Price
    When I add the Cheapest Item to my Cart
    And I add the 2nd item in the inventory to my cart
    And I go to view my Cart
    Then my Cart will contain the items I added
    When I click to go to the delivery details page
    And I fill in my delivery details
    And I click to go to the Checkout Summary page
    Then my Cart will contain the items I added
    And the total price of my order will be correct
    When I click on the finish button
    Then I will be shown the correct Order Completion Page