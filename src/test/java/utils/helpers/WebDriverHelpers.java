package utils.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static utils.selenium.Driver.browser;
import static utils.selenium.Settings.wdHighlightedColour;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*

 helpers
 wdHighlight()              - method for highlighting a given locator using JavaScript
 wdElementIsDisplayed()     - method for checking that a highlighted locator is displayed
 wdElementToDisappear()     - wait for a given locator to not be visible
 wdFindElement()            - find a displayed element by its locator
 wdClick()                  - click on an element which has been found by its locator
 wdSendKeys()               - wait for text field, clear text field, then input given String into the text field

*/


public class WebDriverHelpers {

    private final int sec = 10;

    // method for highlighting a given locator using JavaScript
    public Object wdHighlight(By locator) {
        WebDriver driver = browser();
        WebElement myLocator = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript(wdHighlightedColour, myLocator);
    }

    // method for checking that a highlighted locator is displayed
    public Object wdElementIsDisplayed(By locator) {
        wdHighlight(locator);
        WebDriverWait wait = new WebDriverWait(browser(), sec);
        return wait.until(ExpectedConditions.visibilityOf((WebElement) locator));
    }

    // wait for a given locator to not be visible
    public void wdElementToDisappear(By locator) {
        WebDriverWait wait = new WebDriverWait(browser(), 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // find a displayed element by its locator
    public WebElement wdFindElement(By locator) {
        wdElementIsDisplayed(locator);
        return browser().findElement(locator);
    }

    // click on an element which has been found by its locator
    public void wdClick(By locator) {
        wdFindElement(locator).click();
    }

    // wait for a given text field element (which has been found by its locator) to be displayed,
    // clear the text field if necessary (if ‘clearFirst’ is true),
    // and then input a given String into the text field
    public void wdSendKeys(By locator, String text, boolean clearFirst) {
        if (clearFirst) wdClick(locator);
        wdFindElement(locator).sendKeys(text);
    }



}


