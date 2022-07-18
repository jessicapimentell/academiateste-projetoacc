#autor: jessiimello1311@gmail.com
@Cadastro
Feature: Compra em E-commerce

  @CadastroCliente
  Scenario Outline: Validar cadastro no site
    Given o usuario acesse  site "http://automationpractice.com/index.php"
    And usuario clicar no botao SingIn
    When preencher o campo "<email>", 
    And clicar no botao create my accout, preencher os campos "<fname>","<lname>", "<password>", "<day>","<mounth>","<year>","<company>","<firstAddress>", "<secondAddress>","<city>","<state>","<postalCode>","<country>","<phone>","<mobilePhone>","<referAddress>"
    And clicar no botao Registre
    Then o sistema deve exibir a pagina my account

    Examples: 
      | email              |password  |fname  |lname     |day |mounth|year|company             |firstAddress|secondAddress  |city |state|postalCode|country|phone|mobilePhone|referAddress|
      | Jessica14@gmail.com|123456    |Jessica|Pimentel  | 14 | 5    |1991|Academia Accenture  |Gulf Blvd   |E Friersin Ave |Tampa|9    | 33706    |21     |3426-6741|997117955  |India Shores|