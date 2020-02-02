package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BookingPage {
    private static WebDriver driver= Driver.getDriver();
    public BookingPage(){
        PageFactory.initElements(driver, this );
    }
    @FindBy(xpath = "//button[text()='Book Now']")
    public WebElement book_button;
    @FindBy(xpath = "//div[@class='input-group row-reverse']//input[@type='text']")
    public  WebElement couponCodeTextArea;
    @FindBy(xpath = "//div[@class='input-group-append o1']")
    public WebElement applyCouponButton;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement couponAppliedDisplayedText;
    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public WebElement cookiesButton;
}
