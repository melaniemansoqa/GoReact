package utils.helpers;

import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.selenium.Driver.browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import static utils.selenium.Settings.weHighlightedColour;
/*

 helpers
 weWaitForSeconds()         - wait for a specified number of seconds
 weElementIsDisplayed()     - check that a given WebElement is displayed
 weElementToBeClickable()   - check that a given WebElement is clickable
 weHighlightElement()       - highlight a given WebElement using JavaScript
 weClick()                  - wait for a given WebElement to be clickable, highlight and click
 weSendKeys()               - wait for a given text field WebElement to be displayed, clear text, and input String
 weElementIsInvisible()     - wait for a given WebElement to not be visible anymore
 weGetAttribute()           - find a specified attribute of a given element

*/


public class WebElementHelpers {

    private int sec = 10;

    // wait for a specified number of seconds
    public WebDriverWait weWaitForSeconds() {
        WebDriverWait wait = new WebDriverWait(browser(), sec);
        return wait;
    }

    // check that a given WebElement is displayed, after waiting the specified amount of time
    // from the weWaitForSeconds() method
    public boolean weElementIsDisplayed(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    // check that a given WebElement is clickable,
    // after waiting the specified amount of time from the weWaitForSeconds() method
    public boolean weElementToBeClickable(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.elementToBeClickable(element));
        return element.isEnabled();
    }

    // highlight a given WebElement using JavaScript
    public void weHighlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser();
        js.executeScript(weHighlightedColour, element);
    }

    // wait for a given WebElement to be clickable, highlight the clickable WebElement, and then click the WebElement
    public void weClick(WebElement element) {
        weElementToBeClickable(element);
        weHighlightElement(element);
        element.click();
    }

    // wait for a given text field WebElement to be displayed, clear the text field if necessary
    // (if ‘clearFirst’ is true), and then input a given String into the text field
    public void weSendKeys(WebElement element, String text, boolean clearFirst) {
        weElementIsDisplayed(element);
        if (clearFirst) weClick(element);
        element.sendKeys(text);
    }

    // wait for a given WebElement to not be visible anymore
    public boolean weElementIsInvisible(WebElement element) {
        weWaitForSeconds().until(ExpectedConditions.invisibilityOf(element));
        return !element.isDisplayed();
    }

    // find a specified attribute of a given element
    public static String weGetAttribute(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

}
