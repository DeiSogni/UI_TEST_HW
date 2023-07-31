package demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import demoqa.pages.RegistrationPage;
import demoqa.utils.DataRandoms;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    DataRandoms dataRandoms = new DataRandoms();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.savePageSource = false;
        Configuration.screenshots = false;

        SelenideLogger.addListener("allure", new AllureSelenide());
    }

}
