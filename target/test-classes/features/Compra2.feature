#Author: jessiimello1311@gmail.com

@Compra2
Feature: Compra2 em E-commerce

  @LoginCompra
  Scenario Outline: Validar Login e compra2
    Given usuario esteja no site "http://automationpractice.com/index.php"
    When clique no botao Sing In e preencher os campos email "<e_mail2>", "<senha2>" , clicar no botao Sing in
    And  escolher a peca atraves do campo de pesquisa "<peca>"
    And  continuar compra, escolher categoria atraves da barra menu, prosseguir pagamento "<comentario>"
    Then o sistema deve exibir a confirrmacao da ordem de pagamento
    And retornar ao pagina principal, deslogar, fechar navegador

    Examples: 
      | e_mail2             | senha2  |peca   |comentario															    |
      | Jessica14@gmail.com | 123456  |t-shirt|Nao entregar a Lorena. \n Pois, e presente!|	
