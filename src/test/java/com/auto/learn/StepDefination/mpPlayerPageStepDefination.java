package com.auto.learn.StepDefination;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.FeaturedPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.RefreshPage;
import com.auto.learn.pages.ShoppingCartPage;
import com.auto.learn.pages.mpPlayerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class mpPlayerPageStepDefination {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage cartpage;
	public FeaturedPage featurepage;
	public RefreshPage refreshpage;
	public mpPlayerPage playerpage;

	public mpPlayerPageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage, ShoppingCartPage cartpage, FeaturedPage featurepage,
			RefreshPage refreshpage, mpPlayerPage playerpage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
		this.cartpage = cartpage;
		this.featurepage = featurepage;
		this.refreshpage = refreshpage;
		this.playerpage = playerpage;

	}

	@Given("I am on the mpplayer page")
	public void i_am_on_the_mpplayer_page() {
		playerpage.clickmp3player();
	}

	@When("I enter the all valid details")
	public void i_enter_the_all_valid_details() {
		playerpage.clickshowallplayer();
		playerpage.clickipodclassic();
		playerpage.clearqualitys();
		playerpage.sendkeyQunatity("5");
		descriptionPage.clickAddToCartField();
		descriptionPage.clickCartItems();
		descriptionPage.detailViewCartFields();
	}
}
