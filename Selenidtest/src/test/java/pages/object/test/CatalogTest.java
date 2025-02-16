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

    @Test
    public void CatalogTest1() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.getPurpleDuck();
        catalogPage.getPrice(String.format(priceExpected));
        catalogPage.getStockStatus(String.format(stockStatusExpected));
        catalogPage.getDeliveryStatus(String.format(deliveryStatusExpected));
    }

    @Test
    public void CatalogTest2() {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.getBlueDuck();
        catalogPage.getPrice(String.format(priceExpected1));
        catalogPage.getStockStatus(String.format(stockStatusExpected1));
        catalogPage.getDeliveryStatus(String.format(deliveryStatusExpected));
    }
}
