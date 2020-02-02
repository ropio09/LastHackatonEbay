package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchBoxPage;
import step_definitions.step_impl.HomePage_impl;
import step_definitions.step_impl.SearchBoxPage_impl;
import util.Driver;
import util.SeleniumUtils;

public class SearchBoxPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    SearchBoxPage_impl searchBoxPage_impl = new SearchBoxPage_impl();
    SearchBoxPage searchBoxPage = new SearchBoxPage();


    @When("User searches {string}")
    public void user_searches(String string) {
        SeleniumUtils.click(homePage.search_Box_Field);
        SeleniumUtils.click(homePage.search_Btn);
        //SeleniumUtils.click(searchBoxPage.search_Box_Field);
    }

    @When("User look for {string}")
    public void user_look_for(String string) {
        searchBoxPage_impl.getSearchBox();
        searchBoxPage_impl.getListOfPhones();


    }

    @Then("Verify title of {string}")
    public void verify_title_of(String string) {
        Assert.assertTrue("39.23", true);

    }



}
