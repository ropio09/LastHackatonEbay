@adminPage
Feature: Admin page Testing
  @titleTest
  Scenario: Verify title of Admin Page
    Given User opens admin page
    And User Logs in using credentials
    Then Verifies title is Dashboard
