package com.Dream11.methods;

import org.testng.asserts.SoftAssert;

import com.Dream11.pages.CreateTeamPage;
import com.Dream11.pages.HomePage;
import com.Dream11.pages.LoginPage;
import com.Dream11.pages.MyTeamPage;
import com.Dream11.pages.RegisterPage;
import com.Dream11.pages.SelectAppLanguage;
import com.Dream11.qa.BaseClass;

public class AndroidCreateTeamTestMethods extends BaseClass {
	
	public void androidCreateTeamTestMethods() {
		SoftAssert softAssert = new SoftAssert();
		
		SelectAppLanguage language = new SelectAppLanguage(driver);
		LoginPage loginPage = new LoginPage();
		CreateTeamPage createTeamPage = new CreateTeamPage();
		
		language.clickEnglishRadioButton();
		language.clickContinueButton();
		new RegisterPage(driver).clickLoginButton();
		loginPage.enterEmailOrMobileNumber("7000906944");
		loginPage.clickAgeConfirmationCheckbox();
		loginPage.clickNextButton();
		
		new HomePage().clickFirstCricketCard().clickButtonCreateTeam();
		createTeamPage.selectWicketKeeper(1);
		createTeamPage.clickButtonBat();
		createTeamPage.selectBatsman(1);
		createTeamPage.selectBatsman(2);
		createTeamPage.selectBatsman(3);
		createTeamPage.selectBatsman(4);
		createTeamPage.clickButtonAr();
		createTeamPage.selectAllrounder(0);
		createTeamPage.selectAllrounder(1);
		createTeamPage.clickButtonBowl();
		createTeamPage.selectBowler(0);
		createTeamPage.selectBowler(1);
		createTeamPage.selectBowler(2);
		createTeamPage.selectBowler(3);
		
		createTeamPage.clickButtonNext()
		.clickButtonSave()
		.clickButtonMyTeam();
		softAssert.assertEquals(new MyTeamPage().isMyTeamPresent(), true);
		
		softAssert.assertAll();
	}

}
