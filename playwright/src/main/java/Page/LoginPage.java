package Page;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    public LoginPage() {
    }

    public LoginPage(Page page) {
        this.page = page;
    }

    public void preencherCampoUsuario(String nome) {
        page.fill("//input[@id='user-name']", nome);
    }

 public void preencherCampoSenha(String senha) {
        page.fill("//input[@id='password']", senha);
    }

   public void clicarBotaoLogin() {
        page.click("//input[@id='login-button']");
    }

  public boolean validarLoginComSucesso() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String productsText = page.textContent("//span[contains(.,'Products')]");
        return productsText.contains("Products");
    }
}
