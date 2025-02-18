package pages.object;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private By emailInput = By.cssSelector("[name=email]");
    private By passInput = By.cssSelector("[name=password]");
    private By loginButton = By.cssSelector("[name=login]");

    @Step ("Ввести логин и пароль")
    public void login(String email, String pass) {
        $(emailInput).sendKeys(email);

        $(passInput).sendKeys(pass);

        $(loginButton).click();

    }
}
