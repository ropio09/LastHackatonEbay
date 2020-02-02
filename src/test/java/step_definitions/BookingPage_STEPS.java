package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.AdminCouponPage_impl;
import step_definitions.step_impl.BookingPage_impl;
import util.CucumberUtils;
import util.Driver;

public class BookingPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookingPage_impl bookingPageImpl = new BookingPage_impl();


    @When("Clicks on {string} button")
    public void clicks_on_Book_Now_button(String buttonName) {
        bookingPageImpl.clickButton("cookies");
        bookingPageImpl.clickButton(buttonName);
    }

    @When("Applies existing coupon code")
    public void applies_existing_coupon_code() {
        bookingPageImpl.applyCoupon(AdminCouponPage_impl.currentCoupon);
    }

    @Then("Verifies positive message is displayed")
    public void verifies_positive_message_is_displayed() {
        Assert.assertEquals(bookingPageImpl.expectedCouponMessage, bookingPageImpl.getCouponCodeConfirmationText());
        CucumberUtils.logInfo("Verify coupon code worked", true);
    }



}
