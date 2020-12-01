Feature: Nothing

  Background: Nothing
    Given I visit the Login Page

  Scenario: Nothing
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