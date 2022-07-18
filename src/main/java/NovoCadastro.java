import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NovoCadastro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "C:\\Users\\jessi\\Desktop\\academia-seleniumwebdriver-base\\src\\test\\resources\\drivers\\chromedriver.exe");
	
		WebDriver driver =  new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		
		WebElement linkSingIn = driver.findElement(By.linkText("Sign in"));
		//linkSingIn.click();
		//Thread.sleep(1000);
		
		System.out.println(linkSingIn.getText());
		System.out.println(linkSingIn.getAttribute("title"));
		
		//WebElement txtEmail = driver.findElement(By.id("email_create"));
		//txtEmail.click();
		//txtEmail.sendKeys("Jessiimello@gmail.com");
		//Thread.sleep(1000);
		
		//WebElement btnSubmitCreate = driver.findElement(By.id("SubmitCreate"));
		//btnSubmitCreate.click();
		//Thread.sleep(1000);
		
		//driver.findElement(By.id("id_gender2")).click();
		//Thread.sleep(2000);
	

		
	}
}