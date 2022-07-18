package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContex;

public class CheckoutPage {
	
	public CheckoutPage() {
	PageFactory.initElements(DriverContex.getDriver(), this);
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement clicaSignInn;
	
	@FindBy (how=How.XPATH, using="//*[@id=\"email\"]")
	protected WebElement preencherEmail;
	
	@FindBy (how=How.XPATH, using="//input[@id=\"passwd\"]")
	protected WebElement preencherSenha;
	
	@FindBy (how=How.XPATH, using= "//button[@id=\"SubmitLogin\"]")
	protected WebElement clicarSubmitLogin;
	
	@FindBy (how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	protected WebElement clicarMenu;
	
	@FindBy (how=How.XPATH, using = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
	protected WebElement clicarCategoria;
	
	@FindBy (how=How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	protected WebElement addPeca1;
	
	@FindBy (xpath = "//*[@id=\"add_to_cart\"]/button") 
	protected WebElement addToCart;
	
	@FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement toCheckout;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement toConfirmarEndereco;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement toConfirmarFrete;
	
	@FindBy (id = "uniform-cgv")
	protected WebElement clickTermsService;
	
	@FindBy (xpath = "//*[@id=\"form\"]/p/button")
	protected WebElement toConfirmarPagamento;
	
	@FindBy (xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p")
	protected WebElement modeBankWire;
	
	@FindBy (xpath = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement toConfirmarOrdemPagamento;
	
	@FindBy (xpath = "//*[@id=\"header_logo\"]/a/img")
	protected WebElement toBack;
	
	@FindBy (how=How.CLASS_NAME, using= "search_query")
	protected WebElement toSearch;
	
	@FindBy (how=How.XPATH, using="//*[@id=\"searchbox\"]/button")
	protected WebElement clicarSearch;
	
	@FindBy (how=How.XPATH, using= "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	protected WebElement addPeca2;
	
	@FindBy (id = "color_14")
	protected WebElement colorBlue;
	
	@FindBy (xpath = "//*[@id=\"quantity_wanted_p\"]/a[2]/span")
	protected WebElement addPeca;
	
	@FindBy (xpath = "//*[@id=\"add_to_cart\"]/button")
	protected WebElement addToCart2;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	protected WebElement toContinueShop;
	
	@FindBy (how=How.LINK_TEXT, using = "Women")
	protected WebElement toWomen;
	
	@FindBy (how=How.CLASS_NAME, using= "replace-2x")
	protected WebElement addDress;
	
	@FindBy (xpath = "//*[@id=\"group_1\"]/option[2]")
	protected WebElement toTam;
	
	@FindBy (xpath = "//*[@id=\"add_to_cart\"]/button")
	protected WebElement addPeca3;
	
	@FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	protected WebElement toCheckout2;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[7]/div/a")
	protected WebElement deletePeca;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	protected WebElement toConfirmarEndereco2;
	
	@FindBy (xpath = "//*[@id=\"ordermsg\"]/textarea")
	protected WebElement addComment;
	
	@FindBy (xpath = "//*[@id=\"center_column\"]/form/p/button")
	protected WebElement toConfirmFrete;
	
	@FindBy  (xpath = "//*[@id=\"uniform-cgv\"]")
	protected WebElement clickTermsService2;	
	
	@FindBy(xpath= "//*[@id=\"form\"]/p/button")
	protected WebElement toConfirmarPagamento2;
	
	@FindBy (xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p")
	protected WebElement toPagamentoCheck;
	
	@FindBy (xpath = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement toConfirmarOrdemPagamento2;
	
	@FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]")
	protected WebElement signOut;
	
}
