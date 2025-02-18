package pages.object.test;

import org.testng.annotations.Test;
import pages.object.BinPage;
import pages.object.TestBase;

public class BinTest extends TestBase {

    int quantityExpected;

    @Test (description = "Отображение количества добавленных товаров = 1")
    public void BinFindQuantity1() {
        quantityExpected = 1;
        BinPage binPage = new BinPage();
        binPage.clickRedDuck();
        binPage.addcardProduct();
        binPage.validateQuantity(quantityExpected);
    }

    @Test (description = "Отображение количества добавленных товаров = 2")
    public void BinFindQuantity2() {
        quantityExpected = 2;
        BinPage binPage = new BinPage();
        binPage.clickRedDuck();
        binPage.addcardProduct();
        binPage.addcardProduct();
        binPage.validateQuantity(quantityExpected);
    }
}
