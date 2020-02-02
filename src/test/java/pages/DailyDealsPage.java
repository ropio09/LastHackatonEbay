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
    @FindBy(xpath = "//div[@class='ebayui-dne-banner-text']")
    public WebElement text_ver;


    @FindBy(xpath = "(//span[contains (text(), 'Samsung')])[2]")
    public WebElement firstItem_Btn;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    public WebElement addToCard_Btn;

    @FindBy(xpath = "//div[@id='ADDON_0']//button[1]")
    public  WebElement Nothanks_Btn;

    @FindBy(xpath = "//td[@class='val-col total-row']")
    public  WebElement totalPrice_ver;


//    @FindBy(xpath = "//div[@id='gh-ac-box2']")
//    public  WebElement search_box;
//
//    @FindBy(xpath = "//input[@id='gh-btn']")
//    public  WebElement search_Btn;











}
