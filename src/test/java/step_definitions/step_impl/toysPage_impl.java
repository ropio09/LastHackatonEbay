package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.toysPage;
import util.Driver;
import util.SeleniumUtils;

public class toysPage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage= new HomePage();
    toysPage tp= new toysPage();

    public void clickAllToysDeals(String name){
        switch (name.toLowerCase()){
            case "shop all toy deals": SeleniumUtils.click(tp.allToyDeals);
                break;
        }
    }

    public void selectHighPrice(){
        SeleniumUtils.click(tp.featuredItems);
        SeleniumUtils.click(tp.highPriceFirst);
    }




}
