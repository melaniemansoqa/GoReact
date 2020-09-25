package utils.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.drivers.ChromeWebDriver;
import utils.drivers.FirefoxWebDriver;

//  Used to start either the Chrome or Firefox driver
//  Used Log4J to report any errors when stopping the WebDriver

public class DriverController {

    public static DriverController instance = new DriverController();
    WebDriver webDriver;
    private static Logger log = LogManager.getLogger(DriverController.class.getName());

    public void startChrome(String arg){
        if (instance.webDriver != null) return;
        instance.webDriver = ChromeWebDriver.loadChromeDriver(arg);
    }

    public void startFirefox(String arg){
        if (instance.webDriver != null) return;
        instance.webDriver = FirefoxWebDriver.loadFirefoxDriver(arg);
    }

    public void stopWebDriver(){
        if(instance.webDriver != null) return;

        try
        {
            instance.webDriver.quit();
            instance.webDriver.close();
        }

        catch (Exception e)
        {
            log.error(e + "Error: Unable to stop Web Driver");
        }

        instance.webDriver = null;
        log.debug("Web Driver Stopped");

    }


}
