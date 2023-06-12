package com.Dream11.tests;


import org.testng.annotations.Test;

import com.Dream11.methods.AndroidCreateTeamTestMethods;
import com.Dream11.qa.BaseClass;


public class CreateTeamTest extends BaseClass{
	AndroidCreateTeamTestMethods androidCreateTeamTestMethods = new AndroidCreateTeamTestMethods();
	
	@Test
	public void createTeam() {
		androidCreateTeamTestMethods.androidCreateTeamTestMethods();
	}
	
}
