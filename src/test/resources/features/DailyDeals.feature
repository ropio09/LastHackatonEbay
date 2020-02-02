@DailyPage
Feature: Daily Dealse page Testing
  @smoke
  Scenario: User navigates to "Daily Deals"
    Given User clicks on "Deily Deals"
    Then Verifies title is  "FEATURED DEALS" text
    When User selects "Microsoft Surface Book 13.5in Touchscreen Intel i5-6300U 128GB SSD 8GB Win 10"
    And Clicks on "Add to card" button
     And Cliks "Go to Cart" button
    Then Verify total price




