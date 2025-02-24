package pages.object;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.object.enums.Browser;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Selenide.open;
import static pages.object.helpers.Locators.getLocator;


public class TestBase {
    Browser browsers = Browser.valueOf(System.getProperty("browser", "chrome"));
    DesiredCapabilities caps = new DesiredCapabilities();
    @BeforeMethod
    public void methodSetup() {
        switch (browsers) {
            case chrome:
                Configuration.browser = CHROME;
                caps.setPlatform(Platform.WIN10);
                caps.setPlatform(Platform.LINUX);
                break;
            case firefox:
                Configuration.browser = FIREFOX;
                caps.setPlatform(Platform.WIN10);
                caps.setPlatform(Platform.LINUX);
                break;
        }
            Configuration.timeout = 5000;
            Configuration.pageLoadTimeout = 5000;
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
