package com.auto.learn.StepDefination;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.FeaturedPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.RefreshPage;
import com.auto.learn.pages.ShoppingCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class refreshPagePageStepDefination {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage cartpage;
	public FeaturedPage featurepage;
	public RefreshPage refreshpage;

	public refreshPagePageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage, ShoppingCartPage cartpage, FeaturedPage featurepage,
			RefreshPage refreshpage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
		this.cartpage = cartpage;
		this.featurepage = featurepage;
		this.refreshpage = refreshpage;

	}

	@Given("I on the cart page")
	public void i_on_the_cart_page() {
		descriptionPage.clickCartItems();
		descriptionPage.detailViewCartFields();

	}

	@When("I give the values and refresh it")
	public void i_give_the_values_and_refresh_it() {
		refreshpage.clearFirstquality();
		refreshpage.reEnterFirst("1");
		refreshpage.clickrefreshFirst();
		refreshpage.clearSecondquality();
		refreshpage.reEnterSecond("1");
		refreshpage.clickrefreshSecond();
		refreshpage.clearThirdquality();
		refreshpage.reEntetThird("1");
		refreshpage.clickrefreshThird();
		refreshpage.clearOfFourth();
		refreshpage.reEnterFourth("1");
		refreshpage.clickrefreshFourth();



	}

}
