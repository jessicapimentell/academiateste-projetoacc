import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navegacao {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\jessi\\Desktop\\academia-seleniumwebdriver-base\\src\\test\\resources\\drivers\\chromedriver.exe");
	
		WebDriver driver =  new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		//driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		WebElement linkSingIn = driver.findElement(By.linkText("Sign in"));
		linkSingIn.click();
		Thread.sleep(3000);
		
		WebElement txtEmail = driver.findElement(By.id("email_create"));
		txtEmail.click();
		txtEmail.sendKeys("Jessica06@gmail.com");
		Thread.sleep(3000);
		
		WebElement btnSubmitCreate = driver.findElement(By.id("SubmitCreate"));
		btnSubmitCreate.click();
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Larissa");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Pimentel");
		Thread.sleep(2000);
		
		WebElement passWord = driver.findElement(By.id("passwd"));
		passWord.sendKeys("123456");
		Thread.sleep(2000);
		
		Select comboboxDia = new Select(driver.findElement(By.id("days")));
		comboboxDia.selectByValue("14");
		
		Select comboboxMes = new Select(driver.findElement(By.id("months")));
		comboboxMes.selectByValue("5");
		
		Select comboboxAno = new Select(driver.findElement(By.id("years")));
		comboboxAno.selectByValue("1991");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Accecture");
		Thread.sleep(2000);
		
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("Rua da Alegria");
		Thread.sleep(2000);
		
		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("Rua da Esperança");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Tampa");
		Thread.sleep(2000);
		
		Select comboboxState = new Select(driver.findElement(By.id("id_state")));
		comboboxState.selectByValue("9");
		Thread.sleep(2000);
		
		WebElement code = driver.findElement(By.id("postcode"));
		code.sendKeys("55544");
		Thread.sleep(2000);
		
		Select comboboxCountry = new Select(driver.findElement(By.id("id_country")));
		comboboxCountry.selectByValue("21");
		Thread.sleep(2000);
		
		WebElement homePhone = driver.findElement(By.id("phone"));
		homePhone.sendKeys("3405-4444");
		Thread.sleep(2000);
		
		WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
		mobilePhone.sendKeys("99999-9999");
		Thread.sleep(2000);
		
		WebElement address3 = driver.findElement(By.id("alias"));
		address3.sendKeys("Rua reserva");
		Thread.sleep(2000);
		
		WebElement btnSubmitAccount = driver.findElement(By.id("submitAccount"));
		btnSubmitAccount.click();
		Thread.sleep(2000);
		
		
	}

}
