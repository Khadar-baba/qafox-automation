package com.auto.learn.StepDefination;

import org.testng.Assert;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountPageStepDefination {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;

	public AccountPageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
	}

	@Given("I am on the phones & PDs page")
	public void i_am_on_the_phones_PDs_page() {
accountPage.clickPhonepage();
		
	}

	@When("I see the mobiles and i select the mobile")
	public void i_see_the_mobiles_and_i_select_the_mobile() {
		accountPage.gridViewButton();
		accountPage.htcMobilePage();
	}

	@Then("I see the description of the mobile")
	public void i_see_the_description_of_the_mobile() {
		boolean value= descriptionPage.displayDescritpionField();
		Assert.assertTrue(value);
		
	}

}
