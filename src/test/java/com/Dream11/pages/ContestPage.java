package com.Dream11.pages;

import org.openqa.selenium.WebElement;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContestPage extends BaseClass {
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@id='contest-home-create-team-button']")
	private WebElement btnCreateTeam;
	
	@AndroidFindBy(id = "btnMy Teams")
	private WebElement btnMyTeam;
	
	public CreateTeamPage clickButtonCreateTeam() {
		btnCreateTeam.click();
		return new CreateTeamPage();
	}
	
	public MyTeamPage clickButtonMyTeam() {
		btnMyTeam.click();
		return new MyTeamPage();
	}

} 
