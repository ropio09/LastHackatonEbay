package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.step_impl.CustomerServicePage_impl;
import util.Driver;

public class CustomerServicePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    CustomerServicePage_impl customerImpl = new CustomerServicePage_impl();

    @When("User enters keyword {string} on search bar")
    public void user_enters_keyword_on_search_bar(String string) {
    customerImpl.searchKeyword();
    }

    @When("Checks how many items were found")
    public void checks_how_many_items_were_found() {
    customerImpl.findSize();
    }

    @When("Selects {string}")
    public void selects(String string) {
    customerImpl.selectString(string);
    }

    @When("Clicks thumbs up button")
    public void clicks_thumbs_up_button() {
        customerImpl.clickThumbsUp();
    }

    @Then("User verifies if {string} text appeared")
    public void user_verifies_if_text_appeared(String string) {
        Assert.assertEquals(  string, customerImpl.getText( string ));
    }
}
