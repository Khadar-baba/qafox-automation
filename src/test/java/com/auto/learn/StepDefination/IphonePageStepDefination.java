package com.auto.learn.StepDefination;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.FeaturedPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ShoppingCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class IphonePageStepDefination {	public static final String Url = null;
public LoginPage pagelogin;
public HooksApplication hooksPage;
public AccountsPage accountPage;
public DescriptionPage descriptionPage;
public ShoppingCartPage shoppingCart;
public FeaturedPage featurePage;

public IphonePageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
		DescriptionPage descriptionPage, ShoppingCartPage shoppingCart, FeaturedPage featurePage) {
	this.pagelogin = pagelogin;
	this.hooksPage = hooksPage;
	this.accountPage = accountPage;
	this.descriptionPage = descriptionPage;
	this.shoppingCart = shoppingCart;
	this.featurePage = featurePage;

}
@Given("I select the feature page")
public void i_select_the_feature_page() {
	featurePage.clickshoppingContinue();

	
}
@When("I select the iphone")
public void i_select_the_iphone() {
	featurePage.selectIphone();
	featurePage.clearQuality();
	featurePage.enterQuality("10");
	descriptionPage.clickAddToCartField();
	descriptionPage.clickCartItems();
	descriptionPage.detailViewCartFields();
}

}
