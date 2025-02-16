package pages.object.test;

import org.testng.annotations.Test;
import pages.object.BinPage;
import pages.object.TestBase;

public class BinTest extends TestBase {

    int quantityExpected;

    @Test
    public void BinTest1() {
        quantityExpected = 1;
        BinPage binPage = new BinPage();
        binPage.getRedDuck();
        binPage.getcardProduct();
        binPage.getQuantity(quantityExpected);
    }

    @Test
    public void BinTest2() {
        quantityExpected = 2;
        BinPage binPage = new BinPage();
        binPage.getRedDuck();
        binPage.getcardProduct();
        binPage.getcardProduct();
    }
}
