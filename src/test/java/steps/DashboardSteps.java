package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashboardPage;

public class DashboardSteps extends DashboardPage {

        DashboardPage dashboardPage = new DashboardPage();

        @Given("the user is on the dashboard page")
        public void userIsNavigatedToDashboard() {
            dashboardPage.screenVisible();
        }

}
