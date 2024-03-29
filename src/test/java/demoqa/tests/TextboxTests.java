package demoqa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import demoqa.pages.TexboxPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TextboxTests extends TestBase {

    TexboxPage TextboxPage = new TexboxPage();

    String name = "Alex Egorov",
           email = "Alex@Egorov.com",
           currentAddress = "Some address 1",
           permanentAddress = "Another address 1";

    @Test
    @Tag("ui")
    void successTest() {

        step("Открываем страницу", () -> {
                TextboxPage.openPage();
        });


        TextboxPage
                   .setUserName("Alex Egorov")
                   .setUserEmail("Alex@Egorov.com")
                   .setCurrentAddress("Some address 1")
                   .setPermanentAddress("Another address 1")
                   .submit()
                   .checkResult(name, email, currentAddress, permanentAddress);





    }

}
