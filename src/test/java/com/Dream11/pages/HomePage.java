package com.Dream11.pages;

import org.openqa.selenium.WebElement;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseClass {
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Match_Card_1']")
	private WebElement cricketMatchCard1;
	
	public ContestPage clickFirstCricketCard() {
		cricketMatchCard1.click();
		return new ContestPage();
	}

}
