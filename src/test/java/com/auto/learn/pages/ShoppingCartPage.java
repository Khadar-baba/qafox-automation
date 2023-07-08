package com.auto.learn.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.auto.hooks.HooksApplication;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Checkout']")
	private List<WebElement> checkOut;

	public boolean displayCheckOutField() {
		int value = checkOut.size();
		if (value > 0) {

			return true;
		}
		return false;
	}

	@FindBy(xpath = "//input[contains(@name,'quantity')]")
	private WebElement noOfItems;
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement refreshButton;
	@FindBy(xpath = "//button[contains(@data-original-title,\"Remove\")]")
	private WebElement deleteButton;
	@FindBy(xpath = "//a[text()='Estimate Shipping & Taxes ']")
	private WebElement shippingAndTax;
	@FindBy(id = "input-country")
	private WebElement Country;
	@FindBy(id = "input-zone")
	private WebElement Zone;
	@FindBy(id = "input-postcode")
	private WebElement postcode;
	@FindBy(id = "button-quote")
	private WebElement quote;
	@FindBy(name = "shipping_method")
	private WebElement checkboxRateShipping;
	@FindBy(id = "button-shipping")
	private WebElement shippingButton;
	@FindBy(id = "//div[contains(text(),'Success: Your shipping estimate has been applied!')]")
	private WebElement sucessMessage;
	@FindBy(xpath = "//a[text()='Continue Shopping']")
	private WebElement shoppingContiune;
	@FindBy(xpath = "//a[text()='Continue Shopping']")
	private List<WebElement> continueShopping;
	
 
		public void clickshoppingContinue() {
			shoppingContiune.click();
			
		}
	
	public void enterItems(String number) {

		noOfItems.sendKeys(number);
	}

	public void clearItems() {
		noOfItems.clear();
	}

	public void clickRefreshbutton() {
		refreshButton.click();

	}

	public void clickDeleteButton() {
		deleteButton.click();
	}

	public void clickShippingAndTax() {
		shippingAndTax.click();
	}

	public void countryName(String nameOfcountry) {
		Select selectCountry = new Select(Country);
		selectCountry.selectByVisibleText(nameOfcountry);

	}

	public void stateName(String nameOfState) {
		Select selectState = new Select(Zone);
		selectState.selectByVisibleText(nameOfState);
	}

	public void enterPincode(String pincode) {
		postcode.sendKeys(pincode);

	}

	public void clickQuote() {
		quote.click();
	}

	public void clickCheckBox() {
		checkboxRateShipping.click();

	}

	public void clickshippingButton() {
		shippingButton.click();

	}

	 

	public boolean continueShoppingField() {
		int value = continueShopping.size();
		if (value > 0) {
			return true;

		}
		return false;
	}

}
