package com.Dream11.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectAppLanguage extends BaseClass {

	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131363895")
	private WebElement btnEnglishRadio;
	
	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131363440")
	private WebElement btnHindiRadio;
	
//	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131362262")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	private WebElement btnContinue;
	
	public SelectAppLanguage clickEnglishRadioButton() {
		btnEnglishRadio.click();
		return this;
	}
	
	public SelectAppLanguage(AppiumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage clickContinueButton() {
		btnContinue.click();
		return new RegisterPage(driver);
	}
	
}
