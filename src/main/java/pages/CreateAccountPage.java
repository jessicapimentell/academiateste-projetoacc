package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContex;

public class CreateAccountPage {
	
	public CreateAccountPage() {
	PageFactory.initElements(DriverContex.getDriver(), this);
			
	}
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement clicarSignIn;
	
	@FindBy(how=How.ID, using="email_create")
	protected WebElement txtEmail;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	protected WebElement btnCreateAccount;
	
	@FindBy (how=How.ID, using="id_gender2" )
	protected WebElement gender2;
	
	@FindBy(how=How.ID, using="customer_firstname")
	protected WebElement txtFirstName;
	
	@FindBy(how=How.ID, using="customer_lastname")
	protected WebElement txtLastName;
	
	@FindBy(how=How.ID, using="passwd")
	protected WebElement txtPassWord;
	
	@FindBy (id = "days")
	protected WebElement boxDays;
	
	@FindBy (how=How.ID, using= "months")
	protected WebElement boxMonths;
	
	@FindBy (how=How.ID, using = "years")
	protected WebElement boxYears;
	
	@FindBy (how=How.ID, using = "newsletter")
	protected WebElement clicarNewsLetter;
	
	@FindBy (how=How.ID, using = "company")
	protected WebElement txtCompany;
	
	@FindBy (how=How.ID, using= "address1")
	protected WebElement txtAddress1;
	
	@FindBy (how=How.ID, using="address2")
	protected WebElement txtAddress2;
	
	@FindBy (how=How.ID, using="city")
	protected WebElement txtCity;
	
	@FindBy (how=How.ID, using="id_state")
	protected WebElement boxStates;
	
	@FindBy (how=How.ID, using= "postcode")
	protected WebElement txtCode;
	
	@FindBy (how=How.ID, using="id_country")
	protected WebElement boxCountry1;
	
	@FindBy (how=How.ID, using="phone")
	protected WebElement txtPhone1;
	
	@FindBy(how=How.ID, using="phone_mobile")
	protected WebElement txtPhoneMobile;
	
	@FindBy (how=How.ID, using="alias")
	protected WebElement txtAddress3;
	
	@FindBy(how=How.ID, using="submitAccount")
	protected WebElement btnSubmitAccount;

}
