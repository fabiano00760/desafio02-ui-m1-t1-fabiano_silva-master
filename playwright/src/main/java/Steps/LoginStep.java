package Steps;

import Page.LoginPage;
import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    private LoginPage loginPage;
    private Page page;

    public LoginStep(Page page) {
        this.page = page;
        this.loginPage = new LoginPage(page); // Instancia a classe LoginPage
    }

    public LoginStep() {
    }
    @Given("que eu esteja na pagina home {string}")
    public void queEuEstejaNaPaginaHome(String url) {
        if (page != null) {
            page.navigate(url); // Navegar para a URL passada como argumento
        } else {
            System.out.println("A página não foi inicializada corretamente.");
            // Você pode lançar uma exceção ou lidar com o erro de outra maneira, dependendo do seu caso de uso
        }
    }
    @When("no capo login preencho o campo de username {string}")
    public void noCapoLoginPreenchoOCampoDeUsername(String nome) {
        loginPage.preencherCampoUsuario(nome);
    }


    @And("preencho o campo de password com {string}")
    public void preenchoOCampoDePasswordCom(String senha) {
        loginPage.preencherCampoSenha(senha);
    }

    @And("clico no btn logon")
    public void clicoNoBtnLogon() {
        loginPage.clicarBotaoLogin();
    }

    @Then("logo com sucesso")
    public void logoComSucesso() {
        loginPage.validarLoginComSucesso();
    }





}
