package com.auto.learn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class TabsPage extends BasePage {

	public TabsPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tablet;
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement tabletSelect;

	public void clickTablet() {
		click(tablet);
	}
		public void tabletpage() {
			click(tabletSelect);
		}

	}

