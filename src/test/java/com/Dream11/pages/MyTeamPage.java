package com.Dream11.pages;

import org.openqa.selenium.By;

import com.Dream11.qa.BaseClass;

import io.appium.java_client.AppiumBy;

public class MyTeamPage extends BaseClass {
	
	public boolean isMyTeamPresent() {
		By byAccessibilityId = AppiumBy.accessibilityId("TeamCard");
		if(driver.findElement(byAccessibilityId).isDisplayed()) {
			return true;
		}
		else
		   return false;
	}

}
