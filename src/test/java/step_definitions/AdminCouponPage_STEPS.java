package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminCouponPage;
import pages.AdminPage;
import step_definitions.step_impl.AdminCouponPage_impl;
import step_definitions.step_impl.AdminPage_impl;
import testData.Coupon;
import util.CucumberUtils;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();
    AdminCouponPage_impl adminCouponPage_impl= new AdminCouponPage_impl();
    AdminPage_impl adminPage_impl= new AdminPage_impl();
    AdminCouponPage adminCouponPage= new AdminCouponPage();
    List<Coupon> currentCoupons=null;

    @When("User navigates to Coupon Page")
    public void user_navigates_to_Coupon_Page() {
        SeleniumUtils.sleep(2000);
        adminPage_impl.navigateToPage("coupons");
    }
    @When("User creates a new coupon")
    public void user_creates_a_new_coupon() {
        adminCouponPage_impl.createNewCoupon();
    }


    @When("User creates a new coupon with following info")
//    public void user_creates_a_new_coupon_with_following_info(DataTable dataTable) {
//    public void user_creates_a_new_coupon_with_following_info(List<Coupon> coupons) {
//        currentCoupons=coupons;
//        for(Counpon s: )
//        List<Map<String, String>> list= dataTable.asMaps();
//        SeleniumUtils.click(adminCouponPage.addNewCoupon_Btn);
//        SeleniumUtils.sendKeys(adminCouponPage.percentage_field, list.get(0).get("value"));
//        SeleniumUtils.sendKeys(adminCouponPage.maxUses_field, list.get(1).get("value"));
//        SeleniumUtils.sendKeys(adminCouponPage.startDate_field, list.get(2).get("value"));
//        SeleniumUtils.sendKeys(adminCouponPage.endDate_field, list.get(3).get("value"));
//        if (list.get(4).get("value").equalsIgnoreCase("check"))
//        SeleniumUtils.click(adminCouponPage.tours_checkBox);
//        if (list.get(5).get("value").equalsIgnoreCase("check"))
//        SeleniumUtils.click(adminCouponPage.cars_checkBox);
//        SeleniumUtils.sendKeys(adminCouponPage.codeInput_field, list.get(6).get("value"));
//        SeleniumUtils.click(adminCouponPage.submit_Btn);
//        SeleniumUtils.waitForVisibilityOfElement(adminCouponPage.addNewCoupon_Btn);
//    }

    @Then("Verifies coupon is {string}")
    public void verifies_coupon_is(String status) {
        switch (status.toLowerCase()){
            case "created":
                Assert.assertTrue(adminCouponPage_impl.verifyIfCouponExists());
                CucumberUtils.logInfo("Coupon created", true);
                break;
            case "deleted":
                SeleniumUtils.waitForPageToLoad();
                CucumberUtils.logInfo("Coupon deleted", true);
                Assert.assertFalse(adminCouponPage_impl.verifyIfCouponExists());
        }
    }
    @Then("Deletes newly created coupon")
    public void deletes_newly_created_coupon() {
        adminCouponPage_impl.deleteLastCreatedCoupon();
    }


}
