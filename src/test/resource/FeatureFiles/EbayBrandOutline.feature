@regression @smoke @us-246
Feature: Ebay Brand Outline

  Background: Given Open Ebay Homepage

  Scenario Outline: Filter items by Brand
    Given Search for "<items>"
    When Filter by "<Brand>"
    Then Item list should have products of "<Brand>"

    Examples:
      |Items  |Brand    |
      |Shoes  |Nike     |
      |Shirts |Adidas   |
      |Pants  |Unbranded|