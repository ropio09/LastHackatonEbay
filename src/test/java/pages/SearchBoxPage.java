package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class SearchBoxPage {
    private static WebDriver driver = Driver.getDriver();

    public SearchBoxPage(){

        PageFactory.initElements(
                driver, this);
    }

    @FindBy(xpath = "//input[@class='gh-tb ui-autocomplete-input']")
    public WebElement search_Box_Field;

    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    public WebElement search_Btn;


    }


