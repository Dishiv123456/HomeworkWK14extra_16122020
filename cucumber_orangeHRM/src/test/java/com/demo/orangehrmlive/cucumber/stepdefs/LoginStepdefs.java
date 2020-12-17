package com.demo.orangehrmlive.cucumber.stepdefs;

import com.demo.orangehrmlive.pages.DashboardPage;
import com.demo.orangehrmlive.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^i am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^i enter user name \"([^\"]*)\"$")
    public void iEnterUserName(String userName) {
        new LoginPage().enterUserName(userName);
    }

    @And("^i enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("^i should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() {
        Assert.assertEquals("Welcome mahesh", new DashboardPage().getWelcomeText());
    }

    @And("^i click on welcome admin$")
    public void iClickOnWelcomeAdmin() {
        new DashboardPage().clickOnWelcomeText();
    }

    @And("^i click on log out button$")
    public void iClickOnLogOutButton() {
        new DashboardPage().clickOnLogOutBtn();
    }

    @Then("^i should be able to log out successfully$")
    public void iShouldBeAbleToLogOutSuccessfully() {
        Assert.assertEquals("LOGIN Panel", new LoginPage().getTextToVerifyLogOutSuccessfully());

    }
}