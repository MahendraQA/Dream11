package com.Dream11.qa;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class CommandPrompt {
	
	@Test
	public static void runSever() {
		AppiumDriverLocalService server = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\mahen\\node_modules\\appium\\node_modules\\resolve\\test\\resolver\\without_basedir\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		
		server.start();
	}
	
}
