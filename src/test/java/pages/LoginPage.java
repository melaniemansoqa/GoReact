package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {


    String emailID = "username";
    String passwordID = "password";
    String loginButton_XPATH = "//button[@class=\"btn btn-normal login\"]";
    String closeButton_XPATH = "//button[@class=\"goreact-btn primary-btn\"]";

    public void inputLoginEmail(String email) {
        elementHelpers.inputText(By.id(emailID),email);
    }

    public void inputLoginPassword (String password) {
        elementHelpers.inputText(By.id(passwordID),password);
    }

    public void clickLoginButton () {
        elementHelpers.click(By.xpath(loginButton_XPATH));
    }

    public void clickCloseButton () {
        new WebDriverWait(driver, 20).until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(closeButton_XPATH)));
        elementHelpers.click(By.xpath(closeButton_XPATH));
    }



}
