package com.auto.learn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class RefreshPage extends BasePage {

	public RefreshPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//input[contains(@type,\"text\") and @class=\"form-control\"])[1]")
	private WebElement reEnterValueOfFirst;
	@FindBy(xpath = "(//input[contains(@type,\"text\") and @class=\"form-control\"])[2]")
	private WebElement reEntervalueOfSecond;
	@FindBy(xpath = "(//input[contains(@type,\"text\") and @class=\"form-control\"])[3]")
	private WebElement reEnterValueOfThird;
	@FindBy(xpath = "(//input[contains(@type,\"text\") and @class=\"form-control\"])[4]")
	private WebElement reEnterValueOfFourth;
	@FindBy(xpath = "(//button[contains(@data-original-title,'Update')])[1]")
	private WebElement refreshfirst;
	@FindBy(xpath = "(//button[contains(@data-original-title,'Update')])[2]")
	private WebElement refreshSecond;
	@FindBy(xpath = "(//button[contains(@data-original-title,'Update')])[3]")
	private WebElement refreshThird;
	@FindBy(xpath = "(//button[contains(@data-original-title,'Update')])[4]")
	private WebElement refreshFourth;

	public void clearFirstquality() {
		reEnterValueOfFirst.clear();
	}

	public void clearSecondquality() {
		reEntervalueOfSecond.clear();
	}

	public void clearThirdquality() {
		reEnterValueOfThird.clear();

	}

	public void clearOfFourth() {
		reEnterValueOfFourth.clear();

	}

	public void reEnterFirst(String first) {
		reEnterValueOfFirst.sendKeys(first);

	}

	public void reEnterSecond(String second) {
		reEntervalueOfSecond.sendKeys(second);

	}

	public void reEntetThird(String third) {
		reEnterValueOfThird.sendKeys(third);
	}

	public void reEnterFourth(String fourth) {
		reEnterValueOfFourth.sendKeys(fourth);
	}

	public void clickrefreshFirst() {
		click(refreshfirst);
	}

	public void clickrefreshSecond() {
		click(refreshSecond);

	}

	public void clickrefreshThird() {
		click(refreshThird);
	}

	public void clickrefreshFourth() {
		click(refreshFourth);
	}
}
