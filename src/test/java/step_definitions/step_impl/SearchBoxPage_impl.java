package step_definitions.step_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.SearchBoxPage;
import util.Driver;
import util.SeleniumUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SearchBoxPage_impl {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    SearchBoxPage searchBoxPage = new SearchBoxPage();


    public void getSearchBox(){

        SeleniumUtils.click(searchBoxPage.search_Box_Field);
        SeleniumUtils.sendKeys(searchBoxPage.search_Box_Field, "Phone");
        SeleniumUtils.click(searchBoxPage.search_Btn);
//        SeleniumUtils.click(searchBoxPage.search_Btn);


    }
    public void getListOfPhones(){
        List<WebElement> listOfPhones = driver.findElements(By.className("s-item__price"));
        List<Double> dPrices = new ArrayList<>();
        for(int i = 0; i< listOfPhones.size(); i++){
            String price = listOfPhones.get(i).getText();
            System.out.println(price);
            Double dPrice = Double.valueOf(price.split(" ")[0].substring(1));// getting any prices or so
            dPrices.add(dPrice);
        }

        Collections.sort(dPrices);
        System.out.println("The cheapest is:");
        System.out.println(dPrices.get(0));
        double expected = 39.23;

    }






}
