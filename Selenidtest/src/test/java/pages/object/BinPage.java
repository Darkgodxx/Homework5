package pages.object;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BinPage {
    private By quantity = By.cssSelector("span.quantity");
    private By redDuck = By.cssSelector("[class=\"link\"][title=\"Red Duck\"]");
    private By cardProduct = By.cssSelector("[name=\"add_cart_product\"]");


    public void getQuantity(int quantityExpected) {
        $(quantity).shouldHave(text(String.valueOf(quantityExpected)));
    }

    public void getRedDuck() {
        $(redDuck).click();
    }

    public void getcardProduct() {
        $(cardProduct).click();
    }
}
