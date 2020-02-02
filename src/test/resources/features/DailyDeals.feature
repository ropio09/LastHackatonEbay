@DailyPage
Feature: Daily Deals page Testing
  @smoke
  Scenario: User navigates to "Daily Deals"
    Given User opens home page
    When User clicks on "Daily Deals"
    Then Verifies title is  "FEATURED DEALS" text
    When User selects "Samsung Galaxy Tab S5e 10.5\" 128GB Black SM-T720NZKCXAR 2019 AMOLED + 128GB SD"
    And Clicks on "Add to card" button
    And Clicks "Go to Cart" button
    Then Verify total price is "$328.49"




