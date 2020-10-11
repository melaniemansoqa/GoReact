package utils.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.selenium.Driver.browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import static utils.selenium.Settings.weHighlightedColour;

public class WebElementHelpers {

    protected WebDriverWait wait;
    private WebElement element(By by) {
        return browser().findElement(by);
    }

    public String getText (By by) {
        return element(by).getText();
    }

    public void clearText (By by) {
        if (element(by).getAttribute("value") != null) {
            element(by).clear();
        }
    }

    public void inputText(By by, String text) {
        clearText(by);
        element(by).sendKeys(text);
    }

    public void click(By by) {
        element(by).click();
    }

    public void waitForElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public boolean findAlert(By by, String message) {
        String alert = element(by).getText();
        return alert == message;
    }

    protected void clickBackSpace(By by, int count) {
        for( int i = 0; i < count; i++)
            element(by).sendKeys(Keys.BACK_SPACE);
    }

    protected void clickEnter(By by) {
        element(by).sendKeys(Keys.ENTER);
    }

    public String getString (By by){
        return element(by).toString();
    }

    public void sleep (long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitVisibility (By by) {
        sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
