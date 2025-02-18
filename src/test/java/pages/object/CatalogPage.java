package pages.object;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    private By price = By.cssSelector("[itemprop=\"offers\"]");
    private By stockStatus = By.cssSelector("[class=\"stock-available\"]");
    private By deliveryStatus = By.cssSelector("[class=\"stock-delivery\"]");
    private By purpleDuck = By.cssSelector("[class=\"link\"][title=\"Purple Duck\"]");
    private By blueDuck = By.cssSelector("[class=\"link\"][title=\"Blue Duck\"]");


    @Step("Опеределение цены товара")
    public void validatePrice(String priceExpected) {
        $(price).shouldHave(text(priceExpected));
    }
    @Step("Опеределение статуса товара")
    public void validateStockStatus(String stockStatusExpected) {
        $(stockStatus).shouldHave(text(stockStatusExpected));
    }
    @Step("Опеределение статуса доставки товара")
    public void validateDeliveryStatus(String deliveryStatusExpected) {
        $(deliveryStatus).shouldHave(text(deliveryStatusExpected));
    }
    @Step("Выбрать фиолетовую утку")
    public void clickPurpleDuck() {
        $(purpleDuck).click();
    }
    @Step("Выбрать Синюю")
    public void clickBlueDuck() {
        $(blueDuck).click();
    }
}
