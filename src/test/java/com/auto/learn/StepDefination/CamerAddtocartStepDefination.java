package com.auto.learn.StepDefination;

import com.auto.hooks.HooksApplication;
import com.auto.learn.pages.AccountsPage;
import com.auto.learn.pages.DescriptionPage;
import com.auto.learn.pages.FeaturedPage;
import com.auto.learn.pages.LoginPage;
import com.auto.learn.pages.ShoppingCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CamerAddtocartStepDefination {
	public static final String Url = null;
	public LoginPage pagelogin;
	public HooksApplication hooksPage;
	public AccountsPage accountPage;
	public DescriptionPage descriptionPage;
	public ShoppingCartPage cartpage;
	public FeaturedPage  featurepage;

	public CamerAddtocartStepDefination(LoginPage pagelogin, HooksApplication hooksPage, AccountsPage accountPage,
			DescriptionPage descriptionPage,ShoppingCartPage cartpage,FeaturedPage featurepage) {
		this.pagelogin = pagelogin;
		this.hooksPage = hooksPage;
		this.accountPage = accountPage;
		this.descriptionPage = descriptionPage;
		this. cartpage =cartpage;
		this.featurepage = featurepage;


	}
	@Given("I on the camera page")
	public void i_on_the_camera_page() {
		featurepage.selectCamera();
		featurepage.clickCameraPage();
	
	
	}
	@When("I select the camera via wistlist")
	public void i_select_the_camera_via_wistlist() {
		featurepage.selectCamera();
		featurepage.clickWistList();
		featurepage.wistListCart();
		descriptionPage.clickCartItems();
        descriptionPage.detailViewCartFields();
	}
		
	
}
