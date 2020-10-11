package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage  extends BasePage {

    String navDropdownButton_XPATH = "//button[@id=\"user-navigation-dropdown-btn\"]";

    public void screenVisible() {
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(navDropdownButton_XPATH)));
    }



}
