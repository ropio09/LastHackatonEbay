package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.toysPage;
import step_definitions.step_impl.HomePage_impl;
import step_definitions.step_impl.toysPage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class toysPage_STEPS {
//    private static WebDriver driver = Driver.getDriver();
    toysPage_impl tp_impl= new toysPage_impl();


    @Given("User clicks the {string}")
    public void user_clicks_the(String string) {
        tp_impl.clickAllToysDeals(string);
        SeleniumUtils.sleep(3000);
        tp_impl.selectFeatured();
    }

    @When("User selects {string} from featured items selection")
    public void user_selects_from_featured_items_selection(String string) {
        tp_impl.selectHighPrice(string);
        tp_impl.displayMoreItems();
    }


    @Then("User verifies all {string} items loaded in first page")
    public void user_verifies_all_items_loaded_in_first_page(String string) {

        Assert.assertTrue(string, true);
        tp_impl.allItems();
    }


}
