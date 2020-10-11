package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps extends LoginPage {

    LoginPage loginPage = new LoginPage();

    @When("user inputs {string} on email field")
    public void userInputsEmailOnEmailField(String email) {
        loginPage.inputLoginEmail(email);
    }

    @And("user inputs {string} on password field")
    public void userInputsPasswordOnPasswordField(String password) {
        loginPage.inputLoginPassword(password);
    }

    @And("user clicks Login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user is navigated to {string}")
    public void userIsNavigatedToGoReactDashboard(String title) {
        loginPage.validatePageTitle(title);
    }

    @Then("a modal appears")
    public void aModalAppears() throws InterruptedException {
        loginPage.findModal();
    }

    @And("the modal contains {string} as title")
    public void theModalContainsAsTitle(String title) {
        loginPage.validateModal(title);
    }

    @Then("a modal appears containing {string} as title")
    public void aModalAppearsContainingAsTitle(String title) throws InterruptedException {
        loginPage.findModal();
        loginPage.validateModal(title);
    }

    @And("the user clicks close button")
    public void theUserClicksCloseButton() {
        loginPage.clickCloseButton();
    }
}
