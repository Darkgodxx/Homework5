package pages.object;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.object.enums.Browser;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;
import static pages.object.helpers.Locators.getLocator;


public class TestBase {
    Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));

    @BeforeMethod
    public void methodSetup() {
        switch (browser) {
            case chrome:
                Configuration.browser = CHROME;
                break;
            case firefox:
                Configuration.browser = FIREFOX;
                break;
        }
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 5000;
        open(getLocator("Test.url"));
    }

    @AfterMethod
    public void methodTeardown() {
        Selenide.closeWebDriver();
    }
}
