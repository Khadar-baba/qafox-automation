package com.auto.learn.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.hooks.HooksApplication;

public class FeaturedPage extends BasePage {

	public FeaturedPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);

		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//img[contains(@alt,'MacBook') and @title=\"MacBook\" and @class=\"img-responsive\"]")
	private WebElement macBook;
	@FindBy(xpath = "//img[contains(@alt,'iPhone') and @alt=\"iPhone\" and @class='img-responsive']")
	private WebElement iPhone;
	@FindBy(xpath = "//a[text()='Apple Cinema 30\']")
	private WebElement appleCinema;
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canoneossd;
	@FindBy(xpath = "//a[text()='Specification']")
	private WebElement specification;
	@FindBy(id = "input-quantity")
	private WebElement quality;
	@FindBy(id = "button-cart")
	private WebElement addtocart;
	@FindBy(xpath = "//a[text()='Continue Shopping']")
	private WebElement shoppingContiunefield;
	@FindBy(xpath = "//a[text()='Nikon D300']")
	private WebElement camera;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameraPage;
	@FindBy(xpath = "//button[contains(@type,'button') and @data-toggle=\"tooltip\" and @data-original-title=\"Add to Wish List\" and  @onclick=\"wishlist.add('30');\" ]")
    private WebElement wistlist;
	@FindBy(xpath = "(//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[4]")
	private WebElement wistlistcart;
	public void selectCamera() {
		click(cameraPage);
	}

	public void clickCameraPage() {
		click(camera);
	}
	public void clickWistList() {
		click(wistlist);
	}
	public void wistListCart() {
		click(wistlistcart);
		
	}

	public void clickshoppingContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(shoppingContiunefield));

		shoppingContiunefield.click();
	}

	public void selectMacBoook() {
		macBook.click();

	}

	public void selectIphone() {
		click(iPhone);

	}

	public void selectAppleCinema() {
		appleCinema.click();

	}

	public void selectCanoneossd() {
		canoneossd.click();
	}

	public void selectSpecification() {
		specification.click();

	}

	public void clearQuality() {
		quality.clear();

	}

	public void enterQuality(String qualityNumber) {
		quality.sendKeys(qualityNumber);
	}

	public void addToCart() {
		addtocart.click();

	}
}
