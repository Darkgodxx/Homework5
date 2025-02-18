package pages.object;


import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class BinPage {
    private By quantity = By.cssSelector("span.quantity");
    private By redDuck = By.cssSelector("[class=\"link\"][title=\"Red Duck\"]");
    private By cardProduct = By.cssSelector("[name=\"add_cart_product\"]");

    @Step ("Определение товара")
    public void validateQuantity(int quantityExpected) {
        $(quantity).shouldHave(text(String.valueOf(quantityExpected)));
    }
    @Step ("Выбрать красную утку")
    public void clickRedDuck() {
        $(redDuck).click();
    }
    @Step ("Добавить красную утку")
    public void addcardProduct() {
        $(cardProduct).click();
    }
}
