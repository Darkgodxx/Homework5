package pages.object;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginMessagePage {

    private By messageSuccess = By.cssSelector("[class=\"notice success\"]");
    private By messageError = By.cssSelector("[class=\"notice errors\"]");

    @Step ("Приход сообщения об успешной регистрации")
    public void MessageSuccess(String successExpected) {
        $(messageSuccess).shouldHave(text(successExpected));
    }
    @Step ("Приход сообщения об ошибке при регистрации")
    public void MessageError(String noticeErrorExpected) {
        $(messageError).shouldHave(text(noticeErrorExpected));
    }
}
