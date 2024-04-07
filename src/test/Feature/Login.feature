


  @web
    Feature: Teste de login

      Scenario: teste de login
        Given que eu esteja na pagina home "https://www.saucedemo.com"
        When no capo login preencho o campo de username com "standard_user"
        And preencho o campo de password com "secret_sauce"
        And clico no btn logon
        Then logo com sucesso

@compras
        Scenario: carrinho de compras
          Given que eu esteja na pagina home "https://www.saucedemo.com"
          When no capo login preencho o campo de username com "standard_user"
          And preencho o campo de password com "secret_sauce"
          And clico no btn logon
          When  selecionar primeio produto
          And selecionar segundo produto
          Then conferir o carinho

@checkout
        Scenario: realizar checkout
        Given que eu esteja na pagina home "https://www.saucedemo.com"
        When no capo login preencho o campo de username com "standard_user"
        And preencho o campo de password com "secret_sauce"
        And clico no btn logon
        Given que eu esteja na tela YOUR CART
        When clico no btn checkout
        And preencho campo first name "Fabiano"
        And preencho campo last name  "silva"
        And preencho o campo postal "04851-689"
        And clico em continue
        And e checo o produto selecionado
        And clico no btn finish
        Then checkout realizado com sucesso