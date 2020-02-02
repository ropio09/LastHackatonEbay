package step_definitions.step_impl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.DailyDealsPage;
import util.Driver;
import util.SeleniumUtils;

public class DailyDeals_impl {
    private static WebDriver driver = Driver.getDriver();
    DailyDealsPage DealsPage = new DailyDealsPage();


    public String verifyText(){
        return SeleniumUtils.getText(DealsPage.text_ver);
    }


    public void selectitem() {
        SeleniumUtils.click(DealsPage.firstItem_Btn);

    }
    public  void selectAddToCard(){
        SeleniumUtils.click(DealsPage.addToCard_Btn);

    }
    public  void noThanksBtn(){


        SeleniumUtils.click(DealsPage.Nothanks_Btn);
    }

    public  void  verTotal(){
        SeleniumUtils.getText(DealsPage.totalPrice_ver);
}

}
