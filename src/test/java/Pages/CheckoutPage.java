package Pages;

import FabricaDeDriver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage() {

        driver = FDriver.getDrive();
    }

    public void telaYourCart() {
        driver.findElement(By.xpath("//a[contains(@class,'link')]")).click();
        //  driver.getTitle().contains("YOUR CART");

    }

    public void btnCheckout() {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }

    public void campoNome(String Nome) {
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(Nome);
    }

    public void campoSobreNome(String Sobrenome) {
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(Sobrenome);
    }

    public void CaixaPostal(String cep) {
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(cep);
    }

    public void btnContinuar() {
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }


    public void checarProduto() {
        driver.findElement(By.xpath("//span[contains(.,'Checkout: Overview')]")).getText().contains("CHECKOUT: OVERVIEW");
    }

    public void btnFinish() {
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }

    public void chechoutCompleto() {
        driver.findElement(By.xpath("//h2[@class='complete-header'][contains(.,'Thank you for your order!')]")).getText().contains("THANK YOU FOR YOUR ORDER");
    }


}
