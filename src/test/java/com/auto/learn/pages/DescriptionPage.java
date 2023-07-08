package com.auto.learn.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.hooks.HooksApplication;

public class DescriptionPage extends BasePage {

	public DescriptionPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Description']")
	private List<WebElement> discriptionText;

	public boolean displayDescritpionField() {
		int value = discriptionText.size();
		if (value > 0) {
			return true;

		}
		return false;
	}

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesPage;
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviewField;
	@FindBy(id = "input-quantity")
	private WebElement qualityField;
	@FindBy(id = "button-cart")
	private WebElement addToCartField;
	@FindBy(xpath = "//img[contains(@title,'HTC Touch HD')]")
	private WebElement moibleImages;
	@FindBy(id = "cart-total")
	private WebElement cartItems;
	@FindBy(xpath = "//strong[text()='View Cart']")
	private WebElement viewCartfield;

	public void clickPhonesfield() {
		click(phonesPage);
	}

	public void clickReview() {
		click(reviewField);

	}

	public void enterQualityField(String count) {
		qualityField.sendKeys(count);

	}

	public void clickAddToCartField() {
		click(addToCartField);

	}

	public void clickMobileImage() {
		click(moibleImages);
	}

	public  void clickCartItems() {

		click(cartItems);
	}

	public void detailViewCartFields() {
		click(viewCartfield);

	}
}
