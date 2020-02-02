@DailyPage
Feature: Daily Deals page Testing
  @smoke
  Scenario: User navigates to "Daily Deals"
    Given User opens home page
    When User clicks on "Daily Deals"
    Then Verifies title is  "FEATURED DEALS" text
    When User selects "Microsoft Surface Book 13.5in Touchscreen Intel i5-6300U 128GB SSD 8GB Win 10"
    And Clicks on "Add to card" button
    And Clicks "Go to Cart" button
    Then Verify total price is "$529.00"




