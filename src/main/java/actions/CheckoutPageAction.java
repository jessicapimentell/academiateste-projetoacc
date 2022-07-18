package actions;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CheckoutPage;
import utils.DriverContex;

public class CheckoutPageAction extends CheckoutPage {
	
	protected WebDriverWait wait;
	JavascriptExecutor jse = (JavascriptExecutor)DriverContex.getDriver();
	
	
	public CheckoutPageAction() {
		
		wait = new WebDriverWait(DriverContex.getDriver(),60);
		
	}
	
	public void clicaSignInn() {
		wait.until(ExpectedConditions.elementToBeClickable(clicaSignInn)).click();
	}
	public void preencherEmail (String email) {
		wait.until(ExpectedConditions.visibilityOf(preencherEmail)).sendKeys(email);
	}
	public void preencherSenha (String senha) {
		wait.until(ExpectedConditions.visibilityOf(preencherSenha)).sendKeys(senha);
	}
	public void clicarSubmitLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarSubmitLogin)).click();
	}
	public void clicarMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarMenu)).click();
	}
	public void clicarCategoria() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarCategoria)).click();	
	}
	public void addPeca1() {
		wait.until(ExpectedConditions.elementToBeClickable(addPeca1)).click();	
	}
	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();	
	}
	public void toCheckout() {
		wait.until(ExpectedConditions.elementToBeClickable(toCheckout)).click();	
	}
	public void toConfirmarEndereco() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarEndereco)).click();	
	}
	public void toConfirmarFrete() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarFrete)).click();	
	}
	public void clickTermsService() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTermsService)).click();	
	}
	public void toConfirmarPagamento() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarPagamento)).click();	
	}
	public void modeBankWire() {
		wait.until(ExpectedConditions.elementToBeClickable(modeBankWire)).click();	
	}
	public void toConfirmarOrdemPagamento() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarOrdemPagamento)).click();	
	}
	public void toBack() {
		wait.until(ExpectedConditions.elementToBeClickable(toBack)).click();
	}
	public void toSearch(String tosearch) {
		wait.until(ExpectedConditions.visibilityOf(toSearch)).sendKeys(tosearch);
	}
	public void clicarSearch() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarSearch)).click();
	}
	public void addPeca2() {
		wait.until(ExpectedConditions.elementToBeClickable(addPeca2)).click();
	}
	public void colorBlue() {
		wait.until(ExpectedConditions.elementToBeClickable(colorBlue)).click();
	}
	public void addPeca() {
		wait.until(ExpectedConditions.elementToBeClickable(addPeca)).click();	
	}
	public void addToCart2() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCart2)).click();	
	}
	public void toContinueShop() {
	wait.until(ExpectedConditions.elementToBeClickable(toContinueShop)).click();
	}
	public void toWomen() {
		wait.until(ExpectedConditions.elementToBeClickable(toWomen)).click();
	}
	public void addDress() {
		wait.until(ExpectedConditions.elementToBeClickable(addDress)).click();
	}
	public void toTam() {
		wait.until(ExpectedConditions.elementToBeClickable(toTam)).click();
	}
	public void addPeca3() {
		wait.until(ExpectedConditions.elementToBeClickable(addPeca3)).click();
		
	}

	public void toCheckout2() {
		wait.until(ExpectedConditions.elementToBeClickable(toCheckout2)).click();
	}
	public void deletePeca() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePeca)).click();
	}
	
	public void toConfirmarEndereco2() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarEndereco2)).click();
	}
	public void addComment(String comment) {
		wait.until(ExpectedConditions.visibilityOf(addComment)).sendKeys(comment);
	}
	public void toConfirmFrete() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmFrete)).click();
	}
	public void clickTermsService2() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTermsService2)).click();
	}
	public void toConfirmarPagamento2() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarPagamento2)).click();	
	}
	public void toPagamentoCheck() {
		wait.until(ExpectedConditions.elementToBeClickable(toPagamentoCheck)).click();
	}
	public void toConfirmarOrdemPagamento2() {
		wait.until(ExpectedConditions.elementToBeClickable(toConfirmarOrdemPagamento2)).click();
	}
	public void signOut() {
		wait.until(ExpectedConditions.elementToBeClickable(signOut)).click();
	}
	
	
}
