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

    @Given("User opens admin page")
    public void user_opens_admin_page() {
        Driver.getDriver().get(ConfigReader.readProperty("urlAdmin"));

    }

    @Given("User Logs in using credentials")
    public void logs_in_using_credentials() {
        adminPage_impl.loginUser();
    }

    @Then("Verifies title is Dashboard")
    public void verifies_title_is_Dashboard() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("Dashboard", driver.getTitle());
    }

}
