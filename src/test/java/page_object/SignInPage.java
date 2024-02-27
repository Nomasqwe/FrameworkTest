package page_object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignInPage {
    private SelenideElement loginInput = $(By.xpath("//input[@name='login']"));
    private SelenideElement passwordInput = $(By.xpath("//form[@action='/user/login/index.html']//input[@name='password']"));

    private SelenideElement userNameInput = $(By.xpath("//input[@name='name']"));
    private SelenideElement emailInput = $(By.xpath("//input[@name='email']"));
    private SelenideElement passwordInputForRegistration = $(By.xpath("//form[@action='/user/register/index.html']//input[@name='password']"));
    private SelenideElement registrationButton = $x("//input[@value='Зарегистрироваться']");

    public void inputLogin (String text) {
        this.loginInput.val(text);
    }

    public void inputPassword (String text) {
        this.passwordInput.val(text);
    }

    public void inputUserName (String text) {
        userNameInput.val(text);
    }

    public void inputEmail(String text) {
        emailInput.val(text);
    }

    public void inputPasswordForRegistration(String text) {
        passwordInputForRegistration.val(text);
    }
    public void clickRegistrationButton() {
        registrationButton.click();
    }



}
