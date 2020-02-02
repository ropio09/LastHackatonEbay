package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CustomerServicePage;
import pages.HomePage;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class CustomerServicePage_impl {

    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    CustomerServicePage customerPage = new CustomerServicePage();

    public void clickMyAccountBtn(){
        SeleniumUtils.click(homePage.contactBtn);
    }

    public void searchKeyword() {
        SeleniumUtils.sendKeys(customerPage.contactSearchBar, "money");
       //SeleniumUtils.click( customerPage.contactSearchBar);
    }

    public void findSize() {
        List<WebElement> listItem = customerPage.itemQuantity;
        System.out.println("Size of items: " + listItem.size());
    }

    public void selectString(String str) {
        int listSize = customerPage.itemQuantity.size();
        for (int i = 0; i < listSize; i++) {
            System.out.println("Text: "+customerPage.itemQuantity.get(i).getText());
            if (customerPage.itemQuantity.get(i).getText().contains( str )){
                 customerPage.itemQuantity.get(i).click();
                 break;
            }
        }
    }

    public void clickThumbsUp() {
        SeleniumUtils.moveIntoView(customerPage.thumbsUpBtn   );
        SeleniumUtils.click( customerPage.thumbsUpBtn );
    }

    public String getText(String str) {
       return SeleniumUtils.getText( customerPage.text );
    }

}
