package com.auto.learn.StepDefination;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.FeaturedPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.RefreshPage;
import com.auto.learn.pages.ShoppingCartPage;
import com.auto.learn.pages.TabsPage;
import com.auto.learn.pages.mpPlayerPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class tabletPageStepDefination {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage cartpage;
	public FeaturedPage featurepage;
	public RefreshPage refreshpage;
	public mpPlayerPage playerpage;
	public TabsPage tabletpage;

	public tabletPageStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage, ShoppingCartPage cartpage, FeaturedPage featurepage,
			RefreshPage refreshpage, mpPlayerPage playerpage, TabsPage tabletpage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
		this.cartpage = cartpage;
		this.featurepage = featurepage;
		this.refreshpage = refreshpage;
		this.playerpage = playerpage;
		this.tabletpage = tabletpage;

	}

	@Given("I am on the tablet page")
	public void i_am_on_the_tablet_page() {
		tabletpage.clickTablet();

	}

	@When("I enter all valid fields")
	public void i_enter_all_valid_fields() {
		tabletpage.tabletpage();
		playerpage.clearqualitys();
		playerpage.sendkeyQunatity("5");
		descriptionPage.clickAddToCartField();
		descriptionPage.clickCartItems();
		descriptionPage.detailViewCartFields();

	}
}
