@helpContactPage
Feature: Help and Contact Page Testing
  @contactPageTest
  Scenario: Search by keyword and verify text
    Given User opens home page
    When User clicks on "Help & Contact"
    And User enters keyword "money" on search bar
    And Checks how many items were found
    And Selects "eBay Money Back Guarantee policy"
    And Clicks thumbs up button
    Then User verifies if "Thanks for the feedback!" text appeared
