package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class AdminCouponPage {
    private static WebDriver driver = Driver.getDriver();

    public AdminCouponPage(){
        PageFactory.initElements(driver, this);
    }


}