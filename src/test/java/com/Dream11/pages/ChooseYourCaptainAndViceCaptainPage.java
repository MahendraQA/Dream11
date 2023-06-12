package com.Dream11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseYourCaptainAndViceCaptainPage extends BaseClass {
	
	@AndroidFindBy(id = "create-team-SAVE-button")
	private WebElement btnSave;
	
	@AndroidFindBy(id = "not_now_button_id")
	private WebElement btnNotNow;
	
	public ChooseYourCaptainAndViceCaptainPage selectCaptainByIndex(int index) {
		By byName = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc='special-player-selector-item'])["+index+"]/android.view.ViewGroup[2]");
		driver.findElement(byName).click();
		return this;
	}
	
	public ContestPage clickButtonSave() {
		btnSave.click();
		if(btnNotNow.isDisplayed()) {
			btnNotNow.click();
		}
		return new ContestPage();
	}
	
	public ChooseYourCaptainAndViceCaptainPage selectViceCaptainByIndex(int index) {
		By byName = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc='special-player-selector-item'])["+index+"]/android.view.ViewGroup[3]");
		driver.findElement(byName).click();
		return this;
	}
	
}
