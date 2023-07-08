package com.auto.learn.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class AccountsPage extends BasePage {

	public AccountsPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id ="content")
	private List<WebElement> myaccountText;

	public boolean displayAccountField() {
		int value = myaccountText.size();
		if (value > 0) {

			return true;
		}
		return false;
	}

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesPage;
	@FindBy(id = "list-view")
	private WebElement listViewFiled;
	@FindBy(id = "grid-view")
	private WebElement gridViewPage;
	@FindBy(id = "input-sort")
	private WebElement sortingPage;
	@FindBy(id = "input-limit")
	private WebElement ShowSizePage;
	@FindBy(className = "img-responsive")
	private WebElement imagePage;
	@FindBy(xpath = "//a[contains(@href,'https://tutorialsninja.com/demo/index.php?route=product/product&path=24&product_id=28')]")
	private WebElement htcMobile;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iphoneMobile;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addtocartButton;
	@FindBy(xpath = "//button[contdins(@data-original-title,'Compare this Product')][1]")
	private WebElement compareToProduct;

	public void clickPhonepage() {
		//phonesPage.click();
		click(phonesPage);

	}

	public void listViewButton() {
		listViewFiled.click();

	}

	public void gridViewButton() {
		gridViewPage.click();

	}

	public void phoneImagePage() {
		imagePage.click();

	}

	public void htcMobilePage() {
		htcMobile.click();

	}
	public void iphoneMobilePage() {
		iphoneMobile.click();
		
	}
	public void addToFrameWork() {
		addtocartButton.click();
	}
	public void compareToProduct() {
		compareToProduct.click();
	}
}
