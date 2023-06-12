package com.Dream11.pages;

import org.openqa.selenium.WebElement;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseClass {

	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131363535")
	private WebElement txtFieldEnterMobileNumber;
	
	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131362393")
	private WebElement confirmAgeCheckbox;
	
	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131361910")
	private WebElement btnNext;
	
	public LoginPage clickNextButton() {
		btnNext.click();
		return new LoginPage();
	}
	
	public LoginPage clickAgeConfirmationCheckbox() {
		confirmAgeCheckbox.click();
		return this;
	}
	
	public LoginPage enterEmailOrMobileNumber(String emailOrMobileNumber) {
		txtFieldEnterMobileNumber.clear();
		txtFieldEnterMobileNumber.sendKeys(emailOrMobileNumber);
		return this;
	}
}
