package com.auto.learn.StepDefination;

import org.testng.Assert;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ShoppingCartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DescriptionPageStepDefination {
	public  static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage shoppingCart;

	public DescriptionPageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,DescriptionPage descriptionPage, ShoppingCartPage shoppingCart) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage= descriptionPage;
		this.shoppingCart=shoppingCart;

	}
	@When("I select click the mandatory fields")
	public void i_select_click_the_mandatory_fields() {
		descriptionPage.clickReview();
		descriptionPage.enterQualityField("2");
		descriptionPage.clickAddToCartField();
		descriptionPage.clickCartItems();
		descriptionPage.detailViewCartFields();
		
		
	}
@Then("I display the check out field")
public void i_display_the_check_out_field() {
	boolean value= shoppingCart.displayCheckOutField();
	Assert.assertTrue(value);
	
}
}
