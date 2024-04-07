package Steps;

import Page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.microsoft.playwright.Page;

public class CheckoutStep {

    private CheckoutPage checkoutPage;


    CheckoutStep checkoutStep = new CheckoutStep();

    @Given("que eu esteja na tela YOUR CART")
    public void queEuEstejaNaTelaYourCart() {
        checkoutPage.telaYourCart();
    }

    @When("clico no btn checkout")
    public void clicoNoBtnCheckout() {
        checkoutPage.btnCheckout();
    }

    @And("preencho campo first name {string}")
    public void preenchoCampoFirstName(String nome) {
        checkoutPage.campoNome(nome);
    }

    @And("preencho campo last name  {string}")
    public void preenchoCampoLastName(String sobreNome) {
        checkoutPage.campoSobreNome(sobreNome);
    }

    @And("preencho o campo postal {string}")
    public void preenchoOCampoPostal(String cep) {
        checkoutPage.CaixaPostal(cep);
    }

    @And("clico em continue")
    public void clicoEmContinue() {
        checkoutPage.btnContinuar();
    }

    @And("e checo o produto selecionado")
    public void eChecoOProdutoSelecionado() {
        checkoutPage.checarProduto();
    }

    @And("clico no btn finish")
    public void clicoNoBtnFinish() {
        checkoutPage.btnFinish();
    }

    @Then("checkout realizado com sucesso")
    public void checkoutRealizadoComSucesso() {
        checkoutPage.chechoutCompleto();
    }
}
