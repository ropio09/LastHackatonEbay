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

    @FindBy(xpath = "//a[@_sp='p2481888.m1385.l3250']")
    public WebElement toys;

    @FindBy(id="gh-p-3")
    public WebElement contactBtn;

     //DailyDeals
    @FindBy(xpath = "(//a[@class='gh-p'])[1]")
    public WebElement DailyDeals_Btn;


    // Selvin's additions
    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    public WebElement search_Box_Field;

    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    public WebElement search_Btn;







}


