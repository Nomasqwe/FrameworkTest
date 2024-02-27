package tests.hooks;

import com.codeborne.selenide.Selenide;
import helpers.Driver;
import org.testng.annotations.BeforeTest;


public class Hooks {
    @BeforeTest
    public void beforeTest() {
        Driver.initDriver();
        Selenide.open("http://users.bugred.ru/");
    }
}


