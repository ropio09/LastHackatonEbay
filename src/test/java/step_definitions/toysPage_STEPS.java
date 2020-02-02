package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.toysPage;
import step_definitions.step_impl.HomePage_impl;
import step_definitions.step_impl.toysPage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class toysPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage_impl homePage_impl= new HomePage_impl();
    toysPage_impl tp_impl= new toysPage_impl();
    toysPage tp =new toysPage();


    @When("User selects {string} from featured items selection")
    public void user_selects_from_featured_items_selection(String string) {
        tp_impl.clickAllToysDeals(string);
        SeleniumUtils.sleep(2000);
        tp_impl.selectHighPrice();
    }

    @Then("User verifies items on first page with {string} or more discount")
    public void user_verifies_items_on_first_page_with_or_more_discount(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
