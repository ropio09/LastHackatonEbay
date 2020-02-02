package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class CustomerServicePage {
    private static WebDriver driver = Driver.getDriver();
    public CustomerServicePage(){
        PageFactory.initElements(driver, this);
    }
}
