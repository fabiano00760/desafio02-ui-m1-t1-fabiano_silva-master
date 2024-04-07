package Stepes;

import FabricaDeDriver.FDriver;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {
    LoginPage loginPage;
    WebDriver driver;

    public LoginStep() {
        this.loginPage = new LoginPage();
        this.driver = FDriver.getDrive();
    }

    @Given("que eu esteja na pagina home {string}")
    public void que_eu_esteja_na_pagina_home(String url) {
        driver.get(url);
    }


    @When("no capo login preencho o campo de username com {string}")
    public void no_capo_login_preencho_o_campo_de_username_com(String Nome) {
        loginPage.campoUserName(Nome);
    }

    @And("preencho o campo de password com {string}")
    public void preencho_o_campo_de_password_com(String Senha) {
        loginPage.campoSenha(Senha);

    }

    @And("clico no btn logon")
    public void clico_no_btn_logon() {
        loginPage.CampoBtn();

    }

    @Then("logo com sucesso")
    public void logo_com_sucesso() {
        loginPage.ValidarTele();
    }


}
