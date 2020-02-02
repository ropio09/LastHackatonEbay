package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.toysPage;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    public String getTitle(){
        return driver.getTitle();
    }

    public void clickItem(String name) {
        switch (name.toLowerCase()) {
            case "toys":
                SeleniumUtils.click(homePage.toys);
                break;
            case "daily deals":
                SeleniumUtils.click(homePage.DailyDeals_Btn);
                break;
            case "help & contact":
                SeleniumUtils.click( homePage.contactBtn);
                break;

        }

    }


}