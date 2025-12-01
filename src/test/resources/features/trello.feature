Feature: Trello API workflow

  Scenario: API workflow with expected failures
    Given I try to access the API with invalid endpoint
    And I access the API with valid credentials and create board and cards
    And I logout and try login with invalid credentials expecting failure
