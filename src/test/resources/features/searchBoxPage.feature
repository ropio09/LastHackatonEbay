@searchBoxPage

Feature: Search Testing

  @smokeTest
  Scenario: Verify Search Box
    Given User opens home page
    When User searches "Search Box"
    And User look for "Phones"
    Then Verify title of "cheapest phone"



