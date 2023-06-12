package com.Dream11.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterPage extends BaseClass {
	
	@AndroidFindBy(id = "com.dream11.fantasy.cricket.football.kabaddi:id/2131363972")
	private WebElement btnLogin;
	
	public RegisterPage(AppiumDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickLoginButton() {
		btnLogin.click();
		return new LoginPage();
	}
	
}
