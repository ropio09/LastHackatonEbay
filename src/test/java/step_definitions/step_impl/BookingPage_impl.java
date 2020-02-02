package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import testData.Coupon;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_impl {
    private static WebDriver driver = Driver.getDriver();
    BookingPage bookingPage = new BookingPage();

    public String expectedCouponMessage = AdminCouponPage_impl.currentCoupon.getPercentage() + "% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.";

    public void applyCoupon(Coupon coupon){
        SeleniumUtils.sendKeys(bookingPage.couponCodeTextArea, coupon.getCouponCode());
        SeleniumUtils.click(bookingPage.applyCouponButton);
    }

    public String getCouponCodeConfirmationText(){
        return SeleniumUtils.getText(bookingPage.couponAppliedDisplayedText);
    }

    public void clickButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "book now":
                SeleniumUtils.moveIntoView(bookingPage.book_button);
                SeleniumUtils.click(bookingPage.book_button);
                break;
            case "cookies": SeleniumUtils.click(bookingPage.cookiesButton);
                break;
        }
    }

//    public void deleteLastCreatedCoupon(){
//        SeleniumUtils.click(bookingPage.remove);
//    }


}
