package Pages;

import FabricaDeDriver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage() {
        driver = FDriver.getDrive();
    }

    public void campoUserName(String Name) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Name);
    }

    public void campoSenha(String Senha) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Senha);
    }

    public void CampoBtn() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    public void ValidarTele() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText().contains("Products");
    }


}
