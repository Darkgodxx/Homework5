package pages.object;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.object.enums.Browser;
import pages.object.enums.OS;
import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;
import static pages.object.helpers.Locators.getLocator;


public class TestBase {
    Browser browsers = Browser.valueOf(System.getProperty("browser", "chrome"));
    DesiredCapabilities caps = new DesiredCapabilities();
    OS platform = OS.valueOf(System.getProperty("os", "windows"));

    @BeforeMethod
    public void methodSetup() {
        switch (browsers) {
            case chrome:
                Configuration.browser = CHROME;
                break;
            case firefox:
                Configuration.browser = FIREFOX;
                break;
        }
        switch (platform) {
            case windows:
                caps.setPlatform(Platform.WIN10);
                break;
            case linux:
                caps.setPlatform(Platform.LINUX);
                break;
        }
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.remote = "http://192.168.0.104:4444/wd/hub";
        Configuration.browserCapabilities = caps;
        open(getLocator("Test.url"));

    }

    @AfterMethod
    public void methodTeardown() {
        Selenide.closeWebDriver();
    }
}
