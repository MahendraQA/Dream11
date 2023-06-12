package com.Dream11.qa;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;

//import com.kreditMoneyPe.genericUtility.PropertiesFileUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {

	public static AppiumDriver driver;
	public static AppiumDriverLocalService server;

	@BeforeClass
	public void openSerever() {
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.withAppiumJS(new File("C:\\Users\\mahen\\node_modules\\appium\\node_modules\\resolve\\test\\resolver\\without_basedir\\main.js"))
		.usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		.usingPort(4723)
		.withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
		.withLogFile(new File("appium.txt"))
		.withIPAddress("127.0.0.1");
		server = AppiumDriverLocalService.buildService(builder);
		server.start();
	}
	

	@BeforeMethod
	public void launchApp() {
		String deviceName = PropertiesFileUtility.getDataFromPropertiesFile("deviceName");
		String deviceId = PropertiesFileUtility.getDataFromPropertiesFile("deviceId");
		String platformName = PropertiesFileUtility.getDataFromPropertiesFile("platformName");
		String platformVersion = PropertiesFileUtility.getDataFromPropertiesFile("platformVersion");
		String appPackage = PropertiesFileUtility.getDataFromPropertiesFile("appPackage");
		String appActivity = PropertiesFileUtility.getDataFromPropertiesFile("appActivity");
		String url = PropertiesFileUtility.getDataFromPropertiesFile("url");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("deviceId", deviceId);
		cap.setCapability("platformName", platformName);
		cap.setCapability("platformVersion", platformVersion);

		cap.setCapability("appPackage", appPackage);
		cap.setCapability("appActivity", appActivity);

		URL url1 = null;
		try {
			url1 = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver = new AndroidDriver(url1, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@AfterClass
	public void closeSerever() {
		server.stop();
	}

}
