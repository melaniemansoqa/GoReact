package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.DashboardPage;
import pages.Page;

import java.util.List;

public class BaseSteps extends BasePage  {

    BasePage basePage = new BasePage();


    @Given("a user is on the base page")
    public void userIsOnTheBasePage() {
        basePage.navigateToBaseUrl();
    }

    @Then("they see the page title contains {string}")
    public void they_see_the_page_title_contains(String expectedTitle)  {
        basePage.validatePageTitle(expectedTitle);
    }

    @And("they see the page Url contains {string}")
    public void theySeeThePageUrlContains(String expectedUrl) {
        basePage.validatePageUrl(expectedUrl);
    }

    @Then("modal appears with {string} as title")
    public void modalAppearsWithTitle(String modalTitle)  {
        basePage.validateModal(modalTitle);
    }
}