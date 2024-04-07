package Page;

import com.microsoft.playwright.Page;
import org.bouncycastle.asn1.dvcs.Data;


public class CarrinhoDeCompraPage {
    private Page page;

    public CarrinhoDeCompraPage(Page page) {
        this.page = page;
    }

    public void primeiroProduto() {
        page.click("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    }

    public void segundoProduto() {
        page.click("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    }

    public boolean conferirCarrinho() {
        String cartItemCount = page.textContent("//a[contains(.,'2')]");
        return cartItemCount.contains("2");
    }
}
