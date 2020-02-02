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


}
