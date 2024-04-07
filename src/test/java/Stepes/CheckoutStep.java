package Stepes;

import FabricaDeDriver.FDriver;
import Pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class CheckoutStep {

    CheckoutPage CheckoutPage;
    WebDriver driver;

    public CheckoutStep() {
        CheckoutPage = new CheckoutPage();
        this.driver = FDriver.getDrive();
    }

    @Given("que eu esteja na tela YOUR CART")
    public void que_eu_esteja_na_tela_your_cart() {
        CheckoutPage.telaYourCart();

    }

    @When("clico no btn checkout")
    public void clico_no_btn_checkout() {
        CheckoutPage.btnCheckout();
    }

    @And("preencho campo first name {string}")
    public void preencho_campo_first_name(String nome) {
        CheckoutPage.campoNome(nome);
    }

    @And("preencho campo last name  {string}")
    public void preencho_campo_last_name(String sobreNome) {
        CheckoutPage.campoSobreNome(sobreNome);

    }

    @And("preencho o campo postal {string}")
    public void preencho_o_campo_postal(String cep) {
        CheckoutPage.CaixaPostal(cep);

    }

    @And("clico em continue")
    public void clico_em_continue() {
        CheckoutPage.btnContinuar();
    }

    @And("e checo o produto selecionado")
    public void e_checo_o_produto_selecionado() {
        CheckoutPage.checarProduto();
    }

    @And("clico no btn finish")
    public void clico_no_btn_finish() {
        CheckoutPage.btnFinish();

    }

    @Then("checkout realizado com sucesso")
    public void checkout_realizado_com_sucesso() {
        CheckoutPage.chechoutCompleto();
    }

}
