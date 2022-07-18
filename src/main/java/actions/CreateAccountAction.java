package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CreateAccountPage;
import utils.DriverContex;

public class CreateAccountAction extends CreateAccountPage {
	
	protected WebDriverWait wait;
	
	public CreateAccountAction() {
		//PageFactory.initElements(DriverContex.getDriver(), this);
		wait = new WebDriverWait(DriverContex.getDriver(),60);
		
	}
	public void clicarSignIn() {
		clicarSignIn.click();
	}
	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCreateAccount)).click();
	}
	public void clicarGender() {
		wait.until(ExpectedConditions.elementToBeClickable(gender2)).click();
	}
	public void preencherFirstName(String firstname) {
		wait.until(ExpectedConditions.visibilityOf(txtFirstName)).sendKeys(firstname);
	}
	public void preencherLastName(String lastname) {
		wait.until(ExpectedConditions.visibilityOf(txtLastName)).sendKeys(lastname); 
	}
	public void preencherPassWord(String passwd) {
		wait.until(ExpectedConditions.visibilityOf(txtPassWord)).sendKeys(passwd);
	}
	public void selecionarDays (String days) {
		Select boxDay = new Select(boxDays);
		boxDay.selectByValue(days);		
	}
	public void selecionarMonths (String months) {
		Select boxMonth = new Select (boxMonths);
		boxMonth.selectByValue(months);
	}
	public void selecionarYears (String years) {
		Select boxYear = new Select (boxYears);
		boxYear.selectByValue(years);
	}
	public void clicarNewsLetter() {
		clicarNewsLetter.click();
	}
	public void preencherCompany(String company) {
		wait.until(ExpectedConditions.visibilityOf(txtCompany)).sendKeys(company);
	}
	public void preencherAddress1 (String address1) {
		wait.until(ExpectedConditions.visibilityOf(txtAddress1)).sendKeys(address1);
	}
	public void preencherAddress2 (String address2) {
		wait.until(ExpectedConditions.visibilityOf(txtAddress2)).sendKeys(address2);
	}
	public void preencherCity(String city) {
		wait.until(ExpectedConditions.visibilityOf(txtCity)).sendKeys(city);
	}
	public void selecionarStates(String states) {
		Select boxState = new Select (boxStates);
		boxState.selectByValue(states);
	}
	public void preencherCode (String code) {
		wait.until(ExpectedConditions.visibilityOf(txtCode)).sendKeys(code);
	}
	public void preencherCountry(String country) {
		Select boxCountry = new Select (boxCountry1);
		boxCountry.selectByValue(country);
	}
	public void preencherPhone(String phone1) {
		wait.until(ExpectedConditions.visibilityOf(txtPhone1)).sendKeys(phone1);
	}
	public void preencherPhoneMobile(String phoneMobile) {
		wait.until(ExpectedConditions.visibilityOf(txtPhoneMobile)).sendKeys(phoneMobile);
	}
	public void preencheAddress3(String address3) {
		wait.until(ExpectedConditions.visibilityOf(txtAddress3)).clear();
		wait.until(ExpectedConditions.visibilityOf(txtAddress3)).sendKeys(address3);
	}
	public void clicarSubmitAccount() {
		btnSubmitAccount.click();
	}
	
}		

