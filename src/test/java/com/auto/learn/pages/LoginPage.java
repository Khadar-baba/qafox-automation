package com.auto.learn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class LoginPage extends BasePage {
	public LoginPage(HooksApplication Hooksapp) {
		super(Hooksapp);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//input[contains(@value,'Login')]")
	private WebElement loginButton;
	@FindBy(xpath = "//a[text()='Forgotten Password']")
	private WebElement forgetPassword;

	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);

	}

	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);

	}

	public void clickLoginButton() {
		click(loginButton);

	}

	public void clickForgetPassword() {
		click(forgetPassword);

	}
}
