package pages;

import static utils.selenium.Driver.browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.helpers.WebDriverHelpers;
import utils.helpers.WebElementHelpers;
import utils.selenium.Settings;
import java.util.List;

// The ‘BasePage’ class is where we put all our test methods for our BaseScenarios

public class BasePage extends Page {

    public WebDriver driver = browser();

    protected WebElementHelpers elementHelpers = new WebElementHelpers();
    protected WebDriverHelpers driverHelpers = new WebDriverHelpers();

    private String getTitle() { return driver.getTitle(); }
    private String getUrl() { return driver.getCurrentUrl(); }
    private String getPageSource() {return driver.getPageSource(); }


    public void navigateToBaseUrl() {
        String baseUrl = Settings.baseUrl;
        browser().navigate().to(baseUrl);
        System.out.println("{Product} - Selenium Automation Framework");
    }

    public void validatePageTitle(String expectedTitle) {
        Assert.assertTrue(getTitle().contains(expectedTitle));
        System.out.println(":: The title of the site is: " + getTitle());
    }

    public void validatePageUrl(String expectedUrl){
        Assert.assertTrue(getUrl().contains(expectedUrl));
        System.out.println(":: The page URL is" + getUrl());
    }

    public void validatePageSource(String expectedPageSource) {
        Assert.assertTrue(getPageSource().contains(expectedPageSource));
        System.out.println(":: The page source is: " + getPageSource());
    }


    public void validateMultipleInPageSource(List<String> table) {
        for (String row : table) {
            Assert.assertTrue(getPageSource().contains(row));
            System.out.println("The text " + row + " is in the PageSource");
        }
    }

}
