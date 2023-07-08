package com.auto.learn.StepDefination;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.auto.hooks.HooksApplication;
import com.auto.learn.config.properties.propertiesQafox;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.Hook;

public class LoginPageStepDefination {
	public  static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;

	public LoginPageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;

	}

	@Given("I am on the Qafox login page")
	public void i_am_on_the_Qafox_login_page() throws IOException {
	Properties pro= propertiesQafox.readproProperties();
	 String value= pro.getProperty("Url");
		pagelogin.navigateToUrl(value);

	}

	@When("I given the valid email id and password")
	public void i_given_the_valid_email_id_and_password() {
		pagelogin.enterEmail("automationempire9@gmail.com");
		pagelogin.enterPassword("Test@1234");
		pagelogin.clickLoginButton();

	}

	@Then("I view the accountPage")
	public void i_view_the_accountPage() {
		boolean value = accountPage.displayAccountField();
		Assert.assertTrue(value);
	}

}
