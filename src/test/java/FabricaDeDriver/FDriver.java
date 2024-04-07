package FabricaDeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;


import java.time.Duration;

public class FDriver {


    private static WebDriver driver;


    @Before
    public static void init() throws InterruptedException {
        driver = WebDriverManager.firefoxdriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
    }

    public static WebDriver getDrive() {
        return driver;

    }

    @After
    public static void fecharDriver() {

        driver.close();
    }

    @AfterAll
    public static void endTest() {
        driver.quit();
    }
}
