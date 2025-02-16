package pages.object.test;

import org.testng.annotations.Test;
import pages.object.LoginMessagePage;
import pages.object.LoginPage;
import pages.object.TestBase;

public class LoginTest extends TestBase {
    private String successExpected = "You are now logged in as %s";
    private String login = "piotr.araya@filesaved.org";
    private String pass = "Test1234";
    private String name = "Test Test.";
    private String noticeErrorExpected;

    @Test
    public void LoginTest1() {
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login(login, pass);
        loginMessagePage.getMessageSuccess(String.format(successExpected, name));
    }

    @Test
    public void LoginTest2() {
        noticeErrorExpected = "Wrong password or the account is disabled, or does not exist";
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login("piotr.awfaf.org", pass);
        loginMessagePage.getMessageError(String.format(noticeErrorExpected));
    }

    @Test
    public void LoginTest3() {
        noticeErrorExpected = "You must provide both email address and password.";
        LoginPage loginPage = new LoginPage();
        LoginMessagePage loginMessagePage = new LoginMessagePage();
        loginPage.login(login, "");
        loginMessagePage.getMessageError(String.format(noticeErrorExpected));
    }
}
