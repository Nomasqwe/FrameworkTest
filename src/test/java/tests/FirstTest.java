package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.UrlConfig;
import helpers.Driver;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page_object.MainScreen;
import page_object.SignInPage;


public class FirstTest {
    @Test
    public void firstTest() {
        MainScreen mainScreen = new MainScreen();
        SignInPage signInPage = new SignInPage();
        mainScreen.clickEnterButton();
        String userName = RandomStringUtils.randomAlphabetic(5, 10);
        signInPage.inputUserName(userName);
        signInPage.inputPasswordForRegistration("123");
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.ru";
        signInPage.inputEmail(email);
        signInPage.clickRegistrationButton();
    }
}
