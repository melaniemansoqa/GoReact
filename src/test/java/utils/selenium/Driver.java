package utils.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static utils.selenium.Driver.browser;


// Created a public WebDriver instance which returns DriverController when initiated
// which can then be used in test methods (e.g. maximising the browser() window)

public class Driver {

    public static WebDriver browser(){
        return DriverController.instance.webDriver;
    }
}
