package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DailyDealsPage;
import step_definitions.step_impl.DailyDeals_impl;
import util.SeleniumUtils;

public class DailyDeals_STEPS {
    DailyDeals_impl dailyDeals_impl = new DailyDeals_impl();
    DailyDealsPage daily=new DailyDealsPage();

    @Then("Verifies title is  {string} text")
    public void verifies_title_is_text(String title) {
        Assert.assertEquals(title, dailyDeals_impl.verifyText());
    }

    @When("User selects {string}")
    public void user_selects(String itemName) {

        dailyDeals_impl.selectitem();
    }

    @When("Clicks on {string} button")
    public void clicks_on_button(String buttonName) {
        dailyDeals_impl.selectAddToCard();


    }

    @When("Clicks {string} button")
    public void clicks_button(String buttonName) {
        dailyDeals_impl.noThanksBtn();

    }


    @Then("Verify total price is {string}")
    public void verify_total_price_is(String expectedPrice) {

        Assert.assertEquals(expectedPrice, SeleniumUtils.getText(daily.totalPrice_ver));

    }





}
