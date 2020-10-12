package utils.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.annotations.AfterSuite;
import utils.selenium.DriverController;

//This class file will contain all our Before and After hooks for our Cucumber scenarios,
// which respectively get executed before or after a Cucumber feature and/or scenario.

public class CucumberHooks {

    @Before("@Chrome")
    public void beforeChrome(){
        DriverController.instance.startChrome("--disable-extensions");
    }

    @Before("@Firefox")
    public void beforeFirefox(){
        DriverController.instance.startFirefox("--disable-extensions");
    }

    @Before("@HeadlessChrome")
    public void beforeChromeHeadless(){
        DriverController.instance.startChrome("--headless");
    }

    @Before("@HeadlessFirefox")
    public void beforeFirefoxHeadless(){
        DriverController.instance.startFirefox("--headless");
    }

    @AfterSuite
    public void stopWebDriver(){
        DriverController.instance.stopWebDriver();
    }

}
