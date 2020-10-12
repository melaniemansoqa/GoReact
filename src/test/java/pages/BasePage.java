package pages;

import static utils.selenium.Driver.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import utils.helpers.WebDriverHelpers;
import utils.helpers.WebElementHelpers;
import utils.selenium.Settings;

// The ‘BasePage’ class is where we put all our test methods for our BaseScenarios

public class BasePage extends Page {

    public WebDriver driver = browser();
    protected WebDriverWait wait;

    protected WebElementHelpers elementHelpers = new WebElementHelpers();
    protected WebDriverHelpers driverHelpers = new WebDriverHelpers();

    private String getTitle() { return driver.getTitle(); }
    private String getUrl() { return driver.getCurrentUrl(); }

    String modalTitle_XPATH = "//h4[@class=\"modal-title ng-scope\"]";
    String modalContent_XPATH = "//div[@translate=\"old-site_login-failed-message\"]";
    String modal_XPATH = "//div[@class=\"modal-dialog\"]";


    public void navigateToBaseUrl() {
        String baseUrl = Settings.baseUrl;
        browser().navigate().to(baseUrl);
        System.out.println("User is on " + baseUrl);
    }

    public void validatePageTitle(String expectedTitle) {
        Assert.assertTrue(getTitle().contains(expectedTitle));
        System.out.println(":: The title of the site is: " + getTitle());
    }

    public void validatePageUrl(String expectedUrl){
        Assert.assertTrue(getUrl().contains(expectedUrl));
        System.out.println(":: The page URL is" + getUrl());
    }

    public void findModal() throws InterruptedException {
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(modal_XPATH)));
    }

    public String getModalTitle() {
        String title = browser().findElement(By.xpath(modalTitle_XPATH)).getText();
        return title;
    }

    public String getModalContent() {
        String content = browser().findElement(By.xpath(modalContent_XPATH)).getText();
        return content;
    }

    public void validateModal(String title){
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(modalTitle_XPATH)));
        Assert.assertEquals(getModalTitle(),title);
        System.out.println(":: The modal title:  " + getModalTitle());
        System.out.println(":: The modal content:  " + getModalContent());
    }



}
