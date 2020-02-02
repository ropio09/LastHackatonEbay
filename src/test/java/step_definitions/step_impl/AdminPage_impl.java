package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminPage;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminPage_impl {
    private static WebDriver driver = Driver.getDriver();
    AdminPage adminPage = new AdminPage();
    private String login= ConfigReader.readProperty("login");
    private String password= ConfigReader.readProperty("passw");


    public void loginUser(){
        SeleniumUtils.sendKeys(adminPage.email, login);
        SeleniumUtils.sendKeys(adminPage.password, password);
        clickSignUp();
    }

    public void clickSignUp(){
        SeleniumUtils.click(adminPage.login_Btn);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "coupons":
                SeleniumUtils.click(adminPage.coupons_Btn);
                break;
        }
    }

}
