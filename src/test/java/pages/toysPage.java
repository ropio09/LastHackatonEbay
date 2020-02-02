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

    @FindBy(xpath = "(//div[@role='navigation']//button)[4]")
    public WebElement featuredItems;


    @FindBy(xpath = "//ul[@role='menu']//li[@data-selected-type='3']")
            //"(//li[@role='menuitem'])[3]")
    public WebElement highPriceFirst;


}


