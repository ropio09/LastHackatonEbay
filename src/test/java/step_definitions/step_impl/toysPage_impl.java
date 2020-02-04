package step_definitions.step_impl;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.toysPage;
import util.Driver;
import util.SeleniumUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class toysPage_impl {
    private static WebDriver driver = Driver.getDriver();
    toysPage tp = new toysPage();

    public void clickAllToysDeals(String name) {
        SeleniumUtils.moveIntoView(tp.allToyDeals);
        SeleniumUtils.sleep(1000);
        switch (name.toLowerCase()) {
            case "shop all toy deals":
                SeleniumUtils.click(tp.allToyDeals);
                break;
        }
    }


    public void selectFeatured(){
        SeleniumUtils.click(tp.featuredItems);

    }

    public void selectHighPrice(String name) {
        switch (name.toLowerCase()) {
            case "price: highest first":
                WebElement highPrice = tp.highPriceFirst;
                Actions actions = new Actions(driver);
                actions.moveToElement(highPrice);
                actions.click();
                actions.perform();

                break;
        }
    }


    public void displayMoreItems() {
        SeleniumUtils.sleep(3000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,3000)");

        WebElement lastItem = tp.lastItem;
        Actions actions = new Actions(driver);
        actions.moveToElement(lastItem);
        actions.perform();
    }

    public void allItems(){
        List<WebElement> nameList = tp.item;
        System.out.println("number of items after done loading: "+nameList.size());
    }


    }








