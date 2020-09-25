package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;
import pages.Page;

import java.util.List;

public class BaseSteps extends BasePage {

    BasePage basePage = new BasePage();

    @Given("a DuckDuckGo user is on the base page")
    public void aDuckDuckGoUserIsOnTheBasePage() {
        basePage.navigateToBaseUrl();
    }

    @Then("they see the page title contains {string}")
    public void they_see_the_page_title_contains(String expectedTitle)  {
        basePage.validatePageTitle(expectedTitle);
    }

    @Then("they see the page Url contains {string}")
    public void theySeeThePageUrlContains(String expectedUrl) {
        basePage.validatePageUrl(expectedUrl);
    }

    @Then("they see {string} in the PageSource")
    public void theySeeInThePageSource(String expectedPageSource) {
        basePage.validatePageSource(expectedPageSource);
    }

    @Then("they see")
    public void theySee(List<String> existsInPageSource) {
        basePage.validateMultipleInPageSource(existsInPageSource);

    }
}