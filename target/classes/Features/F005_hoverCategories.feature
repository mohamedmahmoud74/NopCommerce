@smoke
Feature: Hover Feature
  Scenario: user can hover on category
    When    user hover on random category
    And     user click on random sub-category
    Then  validate sub category page title
