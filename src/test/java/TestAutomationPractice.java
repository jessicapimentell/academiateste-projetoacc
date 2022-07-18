import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.CheckoutPageAction;
import actions.CreateAccountAction;
import utils.Constants;
import utils.DriverContex;

class TestAutomationPractice {
	WebDriver driver;
	CreateAccountAction account;
	CheckoutPageAction comprar;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		System.setProperty ("webdrive.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContex.setDriver(driver);
 		account = new CreateAccountAction();
 		comprar = new CheckoutPageAction();
 		
		
	}

	@Test
	void testCadastro() throws InterruptedException {
		account.clicarSignIn();
		account.preencherEmail("Larissa09@gmail.com");
		account.clicarCreateAccount();
		account.clicarGender();
		account.preencherFirstName("Larissa");
		account.preencherLastName("Pimentel");
		account.preencherPassWord("123456");
		account.selecionarDays("14");
		account.selecionarMonths("5");
		account.selecionarYears("1991");
		account.clicarNewsLetter();
		account.preencherCompany("Academia Accenture");
		account.preencherAddress1("Gulf Blvd");
		account.preencherAddress2("E Friersin Ave");
		account.preencherCity("Tampa");
		account.selecionarStates("9");
		account.preencherCode("33706");
		account.preencherCountry("21");
		account.preencherPhone("3426-6741");
		account.preencherPhoneMobile("99711-7955");
		account.preencheAddress3("India Shores");
		account.clicarSubmitAccount();
		
	}
	
	@Test
	void testCompra() throws InterruptedException {
		comprar.clicaSignInn();
		comprar.preencherEmail("Larissa08@gmail.com");
		comprar.preencherSenha("123456");
		comprar.clicarSubmitLogin();
		comprar.clicarMenu();
		comprar.clicarCategoria();
		comprar.addPeca1();
		comprar.addToCart();
		comprar.toCheckout();
		comprar.toConfirmarEndereco();
		comprar.toConfirmarFrete();
		comprar.clickTermsService();
		comprar.toConfirmarPagamento();
		comprar.modeBankWire();
		comprar.toConfirmarOrdemPagamento();
		comprar.toBack();
		comprar.toSearch("t-shirt");
		comprar.clicarSearch();
		comprar.addPeca2();
		comprar.colorBlue();
		comprar.addPeca();
		comprar.addToCart2();
		comprar.toContinueShop();
		comprar.toWomen();
		comprar.addDress();
		comprar.toTam();
		comprar.addPeca3();
		comprar.toCheckout2();
		comprar.deletePeca();
		comprar.toConfirmarEndereco2();
		comprar.addComment("Não entregar a Lorena. \n Pois, é presente!");
		comprar.toConfirmFrete();
		comprar.clickTermsService2();
		comprar.toConfirmarPagamento2();
		comprar.toPagamentoCheck();
		comprar.toConfirmarOrdemPagamento2();
		comprar.signOut();
		
	}	
	
	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

}
