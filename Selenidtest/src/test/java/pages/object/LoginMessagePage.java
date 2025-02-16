package pages.object;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginMessagePage {

    private By messageSuccess = By.cssSelector("[class=\"notice success\"]");
    private By messageError = By.cssSelector("[class=\"notice errors\"]");

    public void getMessageSuccess(String successExpected) {
        $(messageSuccess).shouldHave(text(successExpected));
    }

    public void getMessageError(String noticeErrorExpected) {
        $(messageError).shouldHave(text(noticeErrorExpected));
    }
}
