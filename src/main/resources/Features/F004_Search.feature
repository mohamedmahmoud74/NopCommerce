@smoke
Feature:  user search for products

 Scenario Outline: user could search using product name
    When user search click on search field
    And user search with "<ProductName>"
    Then user could find "<ProductName>"

Examples:
   |ProductName|
   |book|
   |laptop|
   |nike|

  Scenario Outline: user could search for product using sku
    When user search click on search field
    And user search with "<sku>"
    Then user could find "<sku>" inside product details page

    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
