package stepdefinitions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriveManager;
import actions.CreateAccountAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class cadastroStep {
	
	DriveManager manager = new DriveManager();
	WebDriver driver = manager.AbrirUrl();
	CreateAccountAction cadastrar = PageFactory.initElements(driver, CreateAccountAction.class);
	
	public cadastroStep() throws Exception {
		
	}
	
	@Given("o usuario acesse  site {string}")
	public void o_usuario_acesse_site(String url) {
		driver.get(url);
		
	} 
	
	@Given("usuario clicar no botao SingIn")
	public void usuario_clicar_no_botao_sing_in() {
		cadastrar.clicarSignIn();
		
	}

	@And("preencher o campo {string},")
	public void preencher_o_campo(String email) {
		cadastrar.preencherEmail(email);
		cadastrar.clicarCreateAccount();
		
	}

	@When("clicar no botao create my accout, preencher os campos {string},{string}, {string}, {string},{string},{string},{string},{string}, {string},{string},{string},{string},{string},{string},{string},{string}")
	public void clicar_no_botao_create_my_accout_preencher_os_campos(String fname, String lname, String password, String day, String mounth, String year, String company, String firstAddress, String secondAddress, String city, String state, String postalcode, String country, String phone, String mobilephone, String referAddress) {
		cadastrar.clicarGender();
		cadastrar.preencherFirstName(fname);
		cadastrar.preencherLastName(lname);
		cadastrar.preencherPassWord(password);
		cadastrar.selecionarDays(day);
		cadastrar.selecionarMonths(mounth);
		cadastrar.selecionarYears(year);
		cadastrar.clicarNewsLetter();
		cadastrar.preencherCompany(company);
		cadastrar.preencherAddress1(firstAddress);
		cadastrar.preencherAddress2(secondAddress);
		cadastrar.preencherCity(city);
		cadastrar.selecionarStates(state);
		cadastrar.preencherCode(postalcode);
		cadastrar.preencherCountry(country);
		cadastrar.preencherPhone(phone);
		cadastrar.preencherPhoneMobile(mobilephone);
		cadastrar.preencheAddress3(referAddress);
	
	}

	@When("clicar no botao Registre")
	public void clicar_no_botao_registre() {
		cadastrar.clicarSubmitAccount();
	}

	@Then("o sistema deve exibir a pagina my account")
	public void o_sistema_deve_exibir_a_pagina_my_account() {
		assertEquals("My account - My Store", driver.getTitle());
	
	}

	
}
