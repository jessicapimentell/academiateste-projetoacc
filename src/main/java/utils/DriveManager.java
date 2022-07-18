package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriveManager {
	
	private static WebDriver driver;
	
	public WebDriver AbrirUrl() throws Exception {
		
		if (driver == null) {
			
			System.setProperty ("webdrive.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
		DriverContex.setDriver(driver);
		return driver;
		
		
	}
	

}
