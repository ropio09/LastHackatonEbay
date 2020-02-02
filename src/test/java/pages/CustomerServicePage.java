package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class CustomerServicePage {
    private static WebDriver driver = Driver.getDriver();
    public CustomerServicePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="search_input_element")
    public WebElement contactSearchBar;

    @FindBy(xpath="//div[@id='search_suggestions_lists']//a[@class='item']/span/span[2]")
    public List<WebElement> itemQuantity;

    @FindBy(id="thumbs_up")
    public WebElement thumbsUpBtn;

    @FindBy(xpath="//div[contains (text(), 'Thanks for the feedback!')]")
    public WebElement text;
}
