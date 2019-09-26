Feature: Search by keyword

  Scenario: Searching for a term
    Given I want to search for a term
    When I search for "cucumber"
    Then there should be results containing the word "cucumber"