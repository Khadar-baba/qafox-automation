package com.auto.learn.StepDefination;

import org.testng.Assert;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ShoppingCartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingPageStepDefinations {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage cartpage;

	public ShippingPageStepDefinations(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage,ShoppingCartPage cartpage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
		this. cartpage =cartpage;
	}
	@When("I give the quality and taxs field")
	public void i_give_the_quality_and_taxs_field() {
		cartpage.clearItems();
		cartpage.enterItems("10");
		cartpage.clickRefreshbutton();
		cartpage.clickShippingAndTax();
		cartpage.countryName("India");
		cartpage.stateName("Andhra Pradesh");
		cartpage.enterPincode("522124");
		cartpage.clickQuote();
		cartpage.clickCheckBox();
		cartpage.clickshippingButton();
	}
@Then("I display the checkout field")
public void i_display_the_checkout_field() {
	boolean values= cartpage.continueShoppingField();
	Assert.assertTrue(values);	
}

}
