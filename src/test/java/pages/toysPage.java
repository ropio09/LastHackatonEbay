package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class toysPage {
    private static WebDriver driver = Driver.getDriver();
    public toysPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(*//a[@_sp='p2489527.m4891.l9598'])[9]")
    public WebElement allToyDeals;

    @FindBy(xpath = "//div[@_sp='p2380779.m4399.l3']")
    public WebElement featuredItems;


    @FindBy(xpath = "//a[@title='Price: highest first']")
    public WebElement highPriceFirst;


}


