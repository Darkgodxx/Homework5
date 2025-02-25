package pages.object.test;

import pages.object.CatalogPage;
import org.testng.annotations.Test;
import pages.object.TestBase;

public class CatalogTest extends TestBase {
    private String deliveryStatusExpected = "Delivery Status: 3-5 days";
    private String stockStatusExpected = "Stock Status: 29 pcs";
    private String priceExpected = "$0";
    private String stockStatusExpected1 = "Stock Status: 22 pcs";
    private String priceExpected1 = "$20";

    @Test (description = "Отображение информации о товаре 1")
    public void findCatalogInformation1() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.clickPurpleDuck();
        catalogPage.validatePrice(String.format(priceExpected));
        catalogPage.validateStockStatus(String.format(stockStatusExpected));
        catalogPage.validateDeliveryStatus(String.format(deliveryStatusExpected));
    }

    @Test (description = "Отображение информации о товаре 2")
    public void findCatalogInformation2() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.clickBlueDuck();
        catalogPage.validatePrice(String.format(priceExpected1));
        catalogPage.validateStockStatus(String.format(stockStatusExpected1));
        catalogPage.validateDeliveryStatus(String.format(deliveryStatusExpected));
    }
}
