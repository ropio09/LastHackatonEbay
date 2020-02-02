package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class DailyDealsPage {
    private static WebDriver driver = Driver.getDriver();

    public  DailyDealsPage (){

        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "//h3[@title='Microsoft Surface Book 13.5in Touchscreen Intel i5-6300U 128GB SSD 8GB Win 10']")
    public WebElement firstItem_Btn;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']']")
    public WebElement addToCard_Btn;

    @FindBy(xpath = "(//button[@class='addonbtn addonnothx addon-overlay-close-button'])[1]")
    public  WebElement Nothanks_Btn;



}
