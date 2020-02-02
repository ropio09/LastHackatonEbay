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

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login_Btn;

    @FindBy (xpath = "//a[contains(text(),'Coupons')]")
    public WebElement coupons_Btn;


}
