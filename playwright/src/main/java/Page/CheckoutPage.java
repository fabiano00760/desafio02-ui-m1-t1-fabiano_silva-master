package Page;

import com.microsoft.playwright.Page;


public class CheckoutPage {
    private Page page;

    public CheckoutPage(Page page) {
        this.page = page;
    }

    public void telaYourCart() {
        page.click("//a[contains(@class,'link')]");
        // Você pode descomentar a linha abaixo se quiser verificar o título da página
        // page.title().contains("YOUR CART");
    }

    public void btnCheckout() {
        page.click("//button[@id='checkout']");
    }

  public void campoNome(String Nome) {
        page.fill("//input[@id='first-name']", Nome);
    }

    public void campoSobreNome(String Sobrenome) {
        page.fill("//input[@id='last-name']", Sobrenome);
    }

   public void CaixaPostal(String cep) {
        page.fill("//input[@id='postal-code']", cep);
    }

    public void btnContinuar() {
        page.click("//input[@id='continue']");
    }

    public boolean checarProduto() {
        String checkoutOverviewText = page.textContent("//span[contains(.,'Checkout: Overview')]");
        return checkoutOverviewText.contains("CHECKOUT: OVERVIEW");
    }

   public void btnFinish() {
        page.click("//button[@id='finish']");
    }

   public boolean chechoutCompleto() {
        String thankYouText = page.textContent("//h2[@class='complete-header']");
        return thankYouText.contains("THANK YOU FOR YOUR ORDER");
    }
}
