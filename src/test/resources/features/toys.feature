@toysPage
Feature: Going to Toys deals
  @smoke
  Scenario: User navigates to "toys"
    Given User opens home page
    And User clicks on "shop all toy deals"
    And User selects "Price: highest first" from featured items selection
    Then User verifies items on first page with "50%" or more discount