@regression @smoke @us-248
Feature: Ebay Cart Functionality

 Description: User should be able to add items in cart

  Background: Given Open Ebay Homepage

  Scenario: Ebay Cart Functionality
    Given Search for Shirt
    When Select the first shirt on item list
    And Select Size
    And Select Men Size
    And Select Shade
    And Select Quantity
    Then Add to shopping cart