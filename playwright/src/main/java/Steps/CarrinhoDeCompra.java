package Steps;

import Page.CarrinhoDeCompraPage;
import io.cucumber.java.an.Dada;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.microsoft.playwright.Page;


public class CarrinhoDeCompra {

    private CarrinhoDeCompraPage carrinhoDeCompraPage;


    @When("selecionar primeiro produto")
    public void selecionarPrimeiroProduto() {
        carrinhoDeCompraPage.primeiroProduto();
    }



    @And("selecionar segundo produto")
    public void selecionarSegundoProduto() {
        carrinhoDeCompraPage.segundoProduto();
    }

    @Then("conferir o carrinho")
    public void conferirOCarrinho() {
        carrinhoDeCompraPage.conferirCarrinho();
    }


    @When("no capo login preencho o campo de username com {string}")
    public void noCapoLoginPreenchoOCampoDeUsernameCom(String arg0) {
    }
}
