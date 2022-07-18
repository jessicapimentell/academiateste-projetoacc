package stepdefinitions;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import actions.CheckoutPageAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriveManager;

public class compra2step {
	
	DriveManager managerr = new DriveManager();
	WebDriver driverr = managerr.AbrirUrl();
	CheckoutPageAction action = PageFactory.initElements(driverr, CheckoutPageAction.class);
	
	public compra2step() throws Exception {
		
	}
	
	@Given("usuario esteja no site {string}")
	public void usuario_esteja_no_site(String url) {
		driverr.get(url);	
	}
	@When("clique no botao Sing In e preencher os campos email {string}, {string} , clicar no botao Sing in")
	public void clique_no_botao_sing_in_e_preencher_os_campos_email_clicar_no_botao_sing_in(String email, String senha) {
		action.clicaSignInn();
		action.preencherEmail(email);
		action.preencherSenha(senha);
		action.clicarSubmitLogin();
	}

	@And("escolher a peca atraves do campo de pesquisa {string}")
	public void escolher_a_peca_atraves_do_campo_de_pesquisa(String peca) {
		action.toSearch(peca);
		action.clicarSearch();
		action.addPeca2();
		action.colorBlue();
		action.addPeca();
		action.addToCart2();
	}
	
	@And("continuar compra, escolher categoria atraves da barra menu, prosseguir pagamento {string}")
	public void continuar_compra_escolher_categoria_atraves_da_barra_menu_prosseguir_pagamento(String comentario) {
		action.toContinueShop();
		action.toWomen();
		action.addDress();
		action.toTam();
		action.addPeca3();
		action.toCheckout2();
		action.deletePeca();
		action.toConfirmarEndereco2();
		action.addComment(comentario);
		action.toConfirmFrete();
		action.clickTermsService2();
		action.toConfirmarPagamento2();
		action.toPagamentoCheck();
		action.toConfirmarOrdemPagamento2();	
	}

	@Then("o sistema deve exibir a confirrmacao da ordem de pagamento")
	public void o_sistema_deve_exibir_a_confirrmacao_da_ordem_de_pagamento() {
		assertEquals("Order confirmation - My Store", driverr.getTitle());
	}
	
	@And("retornar ao pagina principal, deslogar, fechar navegador")
	public void retornar_ao_pagina_principal_deslogar_fechar_navegador() {
		action.toBack();
		action.signOut();
		driverr.quit();
	}

	
}
