package page_object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainScreen {
    private SelenideElement enterButton = $x("//a[@href='/user/login/index.html']");

    public void clickEnterButton() {
        enterButton.click();
    }
}
