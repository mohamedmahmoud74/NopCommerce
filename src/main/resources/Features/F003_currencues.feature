@smoke
Feature:  user could switch between currencies [$, €]

  Scenario: user can choose Euro currency
    Given   CLick on Currencues LOV
    When    user can select Euro from currency dropdown

    Then    All dollar sign change to Euro sign