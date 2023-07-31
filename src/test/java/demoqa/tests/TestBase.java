package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.pages.RegistrationPage;
import demoqa.utils.DataRandoms;
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
    }

}
