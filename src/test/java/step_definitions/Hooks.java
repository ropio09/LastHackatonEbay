package step_definitions;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import util.Driver;

public class Hooks {
    public static Scenario currentScenario;

    @Before
    public void beforeScenario(Scenario scenario){
        Driver.getDriver();
        currentScenario=scenario;
    }

    @After
    public void afterScenario(){
        //Driver.quitDriver();
    }
}
