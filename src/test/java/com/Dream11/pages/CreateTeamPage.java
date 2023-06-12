package com.Dream11.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTeamPage extends BaseClass {
	
	@AndroidFindBy(id = "btnWK")
	private WebElement btnWK;

	@AndroidFindBy(id = "btnBAT")
	private WebElement btnBat;

	@AndroidFindBy(id = "btnAR")
	private WebElement btnAR;

	@AndroidFindBy(id = "btnBOWL")
	private WebElement btnBowl;

	@AndroidFindBy(id = "selected_player_count")
	private WebElement countSelectedPlayer;

	@AndroidFindBy(id = "credit_left_count")
	private WebElement countCreditLeft;

	@AndroidFindBy(id = "create-team-NEXT-button")
	private WebElement btnNext;
	
	public ChooseYourCaptainAndViceCaptainPage clickButtonNext() {
		btnNext.click();
		return new ChooseYourCaptainAndViceCaptainPage();
	}

	public CreateTeamPage clickButtonWk() {
		btnNext.click();
		return this;
	}
	
	public CreateTeamPage clickButtonBat() {
		btnNext.click();
		return this;
	}
	
	public CreateTeamPage clickButtonAr() {
		btnNext.click();
		return this;
	}
	
	public CreateTeamPage clickButtonBowl() {
		btnNext.click();
		return this;
	}
	
	public CreateTeamPage selectWicketKeeper(int playerIndex) {
		By byAccessibilityId = AppiumBy.accessibilityId("player-row-index-"+playerIndex+"-selected");
		driver.findElement(byAccessibilityId).click();
		return this;
	}
	
	public CreateTeamPage selectBatsman(int playerIndex) {
		By byAccessibilityId = AppiumBy.accessibilityId("player-row-index-"+playerIndex+"-selected");
		driver.findElement(byAccessibilityId).click();
		return this;
	}
	
	public CreateTeamPage selectAllrounder(int playerIndex) {
		By byAccessibilityId = AppiumBy.accessibilityId("player-row-index-"+playerIndex+"-selected");
		driver.findElement(byAccessibilityId).click();
		return this;
	}
	
	public CreateTeamPage selectBowler(int playerIndex) {
		By byAccessibilityId = AppiumBy.accessibilityId("player-row-index-"+playerIndex+"-selected");
		driver.findElement(byAccessibilityId).click();
		return this;
	}
	
	public int getSelectedPlayerCount() {
		int count = Integer.parseInt(countSelectedPlayer.getText());
		return count;
	}
	
	public int getCreditLeft() {
		int credit = Integer.parseInt(countCreditLeft.getText());
		return credit;
	}
	
}
