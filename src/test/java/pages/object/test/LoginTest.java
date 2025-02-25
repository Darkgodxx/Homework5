package pages.object.test;

import io.qameta.allure.*;
import jdk.jfr.Label;
import org.testng.annotations.Test;
import pages.object.LoginMessagePage;
import pages.object.LoginPage;
import pages.object.TestBase;

@Feature("Авторизация")
public class LoginTest extends TestBase {
    private String successExpected = "You are now logged in as %s";
    private String login = "piotr.araya@filesaved.org";
    private String pass = "Test1234";
    private String name = "Test Test.";
    private String noticeErrorExpected;

    @Description ("Авторизации с логином и паролем")
    @Test  (description  = "Успешная Авторизация")
    public void loginSuccessTest() {
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login(login, pass);
        loginMessagePage.MessageSuccess(String.format(successExpected, name));
    }

    @Description ("Авторизации с неверным логином и верным паролем")
    @Test (description = "Неверно введен логин")
    public void loginErrorTest1() {
        noticeErrorExpected = "Wrong password or the account is disabled, or does not existt";
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login("piotr.awfaf.org", pass);
        loginMessagePage.MessageError(String.format(noticeErrorExpected));
    }

    @Description ("Авторизации с логином и пустым паролем")
    @Test (description = "Неверно введен пароль")
    public void loginErrorTest2() {
        noticeErrorExpected = "You must provide both email address and password.";
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login(login, "");
        loginMessagePage.MessageError(String.format(noticeErrorExpected));
    }
}
