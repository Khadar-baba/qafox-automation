package com.auto.learn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.hooks.HooksApplication;

public class mpPlayerPage extends BasePage {

	public mpPlayerPage(HooksApplication appHooks) {
		super(appHooks);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3player;
	@FindBy(xpath = "//a[text()='Show AllMP3 Players']")
	private WebElement showallmpplayer;
	@FindBy(xpath = "(//a[text()='iPod Classic'])[2]")
	private WebElement ipodclassic;
	@FindBy(id = "input-quantity")
	private WebElement quality;

	public void clickmp3player() {
		click(mp3player);
	}

	public void clickshowallplayer() {
		click(showallmpplayer);
	}

	public void clickipodclassic() {
		click(ipodclassic);
	}

	public void clearqualitys() {
		quality.clear();

	}

	public void sendkeyQunatity(String qualityvalue) {
		quality.sendKeys(qualityvalue);
	}

}
