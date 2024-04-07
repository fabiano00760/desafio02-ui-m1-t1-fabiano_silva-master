package Stepes;


import FabricaDeDriver.FDriver;
import Pages.CarrinhoDeCompraPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CarrinhoDeCompra {

    CarrinhoDeCompraPage carrinhoDeCompraPage;
    WebDriver driver;

    public CarrinhoDeCompra() {
        this.carrinhoDeCompraPage = new CarrinhoDeCompraPage();
        this.driver = FDriver.getDrive();
    }

    @When("selecionar primeio produto")
    public void selecionar_primeio_produto() {
        carrinhoDeCompraPage.primeiroProduto();


    }

    @And("selecionar segundo produto")
    public void selecionar_segundo_produto() {
        carrinhoDeCompraPage.segundoProduto();

    }


    @Then("conferir o carinho")
    public void conferirOCarinho() {
        carrinhoDeCompraPage.conferirCarinho();

    }


}
