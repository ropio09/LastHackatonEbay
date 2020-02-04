@toysPage
Feature: Going to Toys deals
  @smoke
  Scenario: Verify discount price for toys
    Given User opens home page
    And User clicks on "toys"
    And User clicks the "shop all toy deals"
    And User selects "Price: highest first" from featured items selection
    Then User verifies all "72" items loaded in first page