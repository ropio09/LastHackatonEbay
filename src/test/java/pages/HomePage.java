package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@data-hover-track='p2481888.m1385.l6435']")
    public WebElement toys;

    @FindBy(id="gh-p-3")
    public WebElement contactBtn;

     //DailyDeals
    @FindBy(xpath = "(//a[@class='gh-p'])[1]")
    public WebElement DailyDeals_Btn;










}


