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


}
