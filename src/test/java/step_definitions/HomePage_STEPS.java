package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    HomePage_impl homePage_impl= new HomePage_impl();

    @Given("User opens home page")
    public void user_opens_home_page() {
        Driver.getDriver().get(ConfigReader.readProperty("url"));


    }

    @Then("Verifies title is Electronics, Cars, Fashion, Collectibles & More | eBay")
    public void verifies_title_is_Electronics_Cars_Fashion_Collectibles_More_eBay() {
   Assert.assertEquals( "Electronics, Cars, Fashion, Collectibles & More | eBay", driver.getTitle() );

    }

    @Given("User clicks on {string}")
    public void user_clicks_on(String string) {
        homePage_impl.clickItem(string);
    }


}
