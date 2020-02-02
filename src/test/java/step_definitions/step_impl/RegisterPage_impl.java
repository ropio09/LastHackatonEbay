package step_definitions.step_impl;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegisterPage;
import testData.NewUserInfo;
import util.Driver;
import util.SeleniumUtils;

public class RegisterPage_impl {
    private static WebDriver driver = Driver.getDriver();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();


    public void navigateToRegisterPage(){

        //homePage.clickSignUp();
    }


    public String getTitle(){
        return driver.getTitle();
    }

}
