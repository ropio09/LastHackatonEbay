package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import step_definitions.step_impl.AdminPage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();
    AdminPage_impl adminPage_impl= new AdminPage_impl();


}
