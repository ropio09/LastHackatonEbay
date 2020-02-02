@bookingPage
Feature: Booking Pages Test
  @couponTest @smoke
  Scenario: Verify coupon code
    Given User opens admin page
    When User Logs in using credentials
    And User navigates to Coupon Page
    And User creates a new coupon
    Then Verifies coupon is "created"
    Given User opens home page
    When User opens "first tour" featured tour
    And Clicks on "Book Now" button
    And Applies existing coupon code
    Then Verifies positive message is displayed

    @deletedCoupon
    Scenario: verify new coupon is created and deleted
      Given User opens admin page
      When User Logs in using credentials
      And User navigates to Coupon Page
      And User creates a new coupon
      Then Verifies coupon is "created"
      And Deletes newly created coupon
      Then Verifies coupon is "deleted"

     @deletedCouponWithParameter
     Scenario: verify new coupon is created and deleted
       Given User opens admin page
       When User Logs in using credentials
       And User navigates to Coupon Page
       And User creates a new coupon with following info
       |percentage
#       | Key          | value       |
#       |percentage    | 45          |
#       |max use       | 3           |
#       |start date    | 28/01/2020  |
#       |end date      | 30/01/2020   |
#       |tours checkbox| check        |
#       |cars checkbox | check        |
#       |coupon code   | 45        |

       Then Verifies coupon is "created"
       #And Deletes newly created coupon
       #Then Verifies coupon is "deleted"
  @scenarioOutline
  Scenario: Outline example
    Given I navigate to website "https://google.com"