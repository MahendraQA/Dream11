package com.Dream11.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {

	public static String getDataFromPropertiesFile(String key) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(ConstantPathsAndUrl.PropertiesFilePath);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fin);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		String value = prop.getProperty(key);
		return value;
	}
}
