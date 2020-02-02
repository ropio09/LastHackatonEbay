package step_definitions.step_impl;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.toysPage;
import util.Driver;
import util.SeleniumUtils;

import java.util.HashMap;
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


    public void selectHighPrice(String name) {
        switch (name.toLowerCase()) {
            case "Price: highest first":
                SeleniumUtils.click(tp.highPriceFirst);
//                System.out.println("--------> "+tp.highPriceFirst);
                break;
        }
    }

    public void moreDiscount() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450)");

        WebElement Elmnt = driver.findElement(By.xpath("(//div[@class='dne-itemtile dne-itemtile-large'])[72]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Elmnt);
        actions.perform();

        List<WebElement> hotelList = driver.findElements(By.xpath("//div[@class='dne-itemtile-detail']"));
        System.out.println(hotelList.size());
        /*
        for(WebElement e: hotelList){
            System.out.println(e.getText());
        }

        Map<String, Integer> discountsMap = new HashMap<>();
        Map<String, Integer> pricesMap = new HashMap<>();

        for(WebElement element: hotelList) {
            String itemName = element.findElement(By.xpath("//span[@itemprop='name']")).getText();
//            String price = element.findElement(By.xpath(".//span[@data-stid='content-hotel-lead-price']")).getText();

            String discount = "No discount";
            try {
                discount = element.findElement(By.xpath("//span[@class='itemtile-price-bold']")).getText();
            }catch (Exception e){ }

            int actualDiscount = convertDiscount(discount);


            if (actualDiscount > 50)
                discountsMap.put(itemName, actualDiscount);

        }
        System.out.println("=====================  Discounts  ===================");
        discountsMap.forEach((K, V) -> System.out.println("Hotel name: " + K + " | Discount amount: " + V + "%"));


        System.out.println("===============     FINAL   ===============");
        for(String itemName: discountsMap.keySet()){
            if(discountsMap.containsKey(itemName) && pricesMap.containsKey(itemName)){
                if (discountsMap.get(itemName) > 50)
                    System.out.println(itemName + " | Price: " + pricesMap.get(itemName) + " | Discount: " + discountsMap.get(itemName));
            }
        }
        driver.quit();

    }


    static int convertDiscount(String discount){
        int actualDiscount=0;
        if (discount.contains("%")){
            if (discount.length() < 8){
                actualDiscount = Integer.parseInt(discount.substring(0,discount.indexOf("%")));
            }else {
                actualDiscount = Integer.parseInt(discount.substring(discount.indexOf("%") - 2, discount.indexOf("%")).trim());
            }
        }
        return actualDiscount;
    }

//    static int convertPrice(String price){
//        return Integer.parseInt(price.substring(1));
//    }

*/
    }
}



