@adminCouponPage
  Feature: Admin coupon page test
    @addingCoupon @smoke
    Scenario: verify new coupon is created
      Given User opens admin page
      When User Logs in using credentials
      And User navigates to Coupon Page
      And User creates a new coupon
      Then Verifies coupon is "created"