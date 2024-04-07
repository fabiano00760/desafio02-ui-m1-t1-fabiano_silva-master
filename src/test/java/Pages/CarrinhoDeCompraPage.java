package Pages;

import FabricaDeDriver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoDeCompraPage {
    WebDriver driver;

    public CarrinhoDeCompraPage() {
        driver = FDriver.getDrive();
    }

    public void primeiroProduto() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
    }

    public void segundoProduto() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
    }

    public void conferirCarinho() {
        driver.findElement(By.xpath("//a[contains(.,'2')]")).getText().contains("2");
    }


}
