package pages.object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CatalogPage {
    private By price = By.cssSelector("[itemprop=\"offers\"]");
    private By stockStatus = By.cssSelector("[class=\"stock-available\"]");
    private By deliveryStatus = By.cssSelector("[class=\"stock-delivery\"]");
    private By purpleDuck = By.cssSelector("[class=\"link\"][title=\"Purple Duck\"]");
    private By blueDuck = By.cssSelector("[class=\"link\"][title=\"Blue Duck\"]");

    public void getPrice(String priceExpected) {
        $(price).shouldHave(text(priceExpected));
    }

    public void getStockStatus(String stockStatusExpected) {
        $(stockStatus).shouldHave(text(stockStatusExpected));
    }

    public void getDeliveryStatus(String deliveryStatusExpected) {
        $(deliveryStatus).shouldHave(text(deliveryStatusExpected));
    }

    public void getPurpleDuck() {
        $(purpleDuck).click();
    }

    public void getBlueDuck() {
        $(blueDuck).click();
    }
}
