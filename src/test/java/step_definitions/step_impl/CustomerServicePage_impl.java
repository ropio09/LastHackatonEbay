package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.CustomerServicePage;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

public class CustomerServicePage_impl {

    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    CustomerServicePage helpPage = new CustomerServicePage();

    public void clickMyAccountBtn(){
        SeleniumUtils.click(homePage.contactBtn);
    }


}
