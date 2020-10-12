$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login/LoginStudent.feature");
formatter.feature({
  "name": "Student Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Chrome"
    }
  ]
});
formatter.scenario({
  "name": "01. Validate the title and url of a website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "name": "a user is on the base page",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userIsOnTheBasePage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat pages.BasePage.navigateToBaseUrl(BasePage.java:35)\n\tat steps.BaseSteps.userIsOnTheBasePage(BaseSteps.java:21)\n\tat ✽.a user is on the base page(file:src/test/java/features/Login/LoginStudent.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "they see the page title contains \"GoReact\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseSteps.they_see_the_page_title_contains(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "they see the page Url contains \"https://dev.goreact.com/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.theySeeThePageUrlContains(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "02. Validate that a student cannot login to web app when using invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "a user is on the base page",
  "keyword": "Given "
});
formatter.step({
  "name": "user inputs \"\u003cemail\u003e\" on email field",
  "keyword": "When "
});
formatter.step({
  "name": "user inputs \"\u003cpassword\u003e\" on password field",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "a modal appears containing \"Login failed\" as title",
  "keyword": "Then "
});
formatter.step({
  "name": "the user clicks close button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "themelaniemanso+student@gmail.com",
        "wrongpassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "02. Validate that a student cannot login to web app when using invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "name": "a user is on the base page",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userIsOnTheBasePage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat pages.BasePage.navigateToBaseUrl(BasePage.java:35)\n\tat steps.BaseSteps.userIsOnTheBasePage(BaseSteps.java:21)\n\tat ✽.a user is on the base page(file:src/test/java/features/Login/LoginStudent.feature:10)\n",
  "status": "failed"
});
formatter.step({
  "name": "user inputs \"themelaniemanso+student@gmail.com\" on email field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userInputsEmailOnEmailField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user inputs \"wrongpassword\" on password field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userInputsPasswordOnPasswordField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "a modal appears containing \"Login failed\" as title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.aModalAppearsContainingAsTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks close button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.theUserClicksCloseButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "03. Validate that a student can login to web app",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "a user is on the base page",
  "keyword": "Given "
});
formatter.step({
  "name": "user inputs \"\u003cemail\u003e\" on email field",
  "keyword": "When "
});
formatter.step({
  "name": "user inputs \"\u003cpassword\u003e\" on password field",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "the user is on the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "they see the page Url contains \"https://dev.goreact.com/dashboard/\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "themelaniemanso+student@gmail.com",
        "Password**123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "03. Validate that a student can login to web app",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    }
  ]
});
formatter.step({
  "name": "a user is on the base page",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.userIsOnTheBasePage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat pages.BasePage.navigateToBaseUrl(BasePage.java:35)\n\tat steps.BaseSteps.userIsOnTheBasePage(BaseSteps.java:21)\n\tat ✽.a user is on the base page(file:src/test/java/features/Login/LoginStudent.feature:22)\n",
  "status": "failed"
});
formatter.step({
  "name": "user inputs \"themelaniemanso+student@gmail.com\" on email field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userInputsEmailOnEmailField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user inputs \"Password**123\" on password field",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userInputsPasswordOnPasswordField(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClicksLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardSteps.userIsNavigatedToDashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "they see the page Url contains \"https://dev.goreact.com/dashboard/\"",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.theySeeThePageUrlContains(String)"
});
formatter.result({
  "status": "skipped"
});
});