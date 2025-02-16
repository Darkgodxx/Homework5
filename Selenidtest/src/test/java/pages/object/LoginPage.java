package pages.object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private By emailInput = By.cssSelector("[name=email]");
    private By passInput = By.cssSelector("[name=password]");
    private By loginButton = By.cssSelector("[name=login]");

    public void login(String email, String pass) {
        $(emailInput).sendKeys(email);

        $(passInput).sendKeys(pass);

        $(loginButton).click();

    }
}
