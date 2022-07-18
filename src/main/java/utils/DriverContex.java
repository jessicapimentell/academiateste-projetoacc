package utils;

import org.openqa.selenium.WebDriver;

public class DriverContex {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver (WebDriver driver) {
		DriverContex.driver = driver;
	}

}
