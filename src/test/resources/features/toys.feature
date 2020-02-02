@toysPage
Feature: Going to Toys deals
  @smoke
  Scenario: Verify discount price for toys
    Given User opens home page
    And User clicks on "toys"
    And User clicks the "shop all toy deals"
    And User selects "Price: highest first" from featured items selection
    Then User verifies items on first page with "50%" or more discount