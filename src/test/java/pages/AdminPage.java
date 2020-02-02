package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class AdminPage {
    private static WebDriver driver = Driver.getDriver();
    public AdminPage(){
        PageFactory.initElements(driver, this);
    }




}
