package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class toysPage {
    private static WebDriver driver = Driver.getDriver();
    public toysPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(*//a[@_sp='p2489527.m4891.l9598'])[9]")
    public WebElement allToyDeals;

    @FindBy(xpath = "(//div[@role='navigation']//button)[4]")
    public WebElement featuredItems;


    @FindBy(xpath = "//a[@title='Price: highest first']")
    public WebElement highPriceFirst;

    @FindBy(xpath = "(//div[@class='dne-itemtile dne-itemtile-large'])[72]")
    public WebElement lastItem;

    @FindBy(xpath = "//span[@itemprop='name']")
    public List<WebElement> item;






}


