package FabricaDeDriver;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FDrive {
    private static Playwright playwright;
    private static Browser browser;
    private static BrowserType chromium;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        chromium = playwright.chromium();
        try {
            // Alterado para headless
            browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(true));
        } catch (PlaywrightException e) {
            System.err.println("Erro ao lançar o navegador: " + e.getMessage());
        }
    }

    @AfterAll
    static void closeBrowser() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }

    @BeforeEach
    void createContextAndPage() {
        BrowserContext context = browser.newContext();
        Page page = context.newPage();
        // Verifica se a página foi criada com sucesso
        assertNotNull(page);
    }

    @AfterEach
    void closeContext() {
        browser.contexts().forEach(BrowserContext::close);
    }
}
