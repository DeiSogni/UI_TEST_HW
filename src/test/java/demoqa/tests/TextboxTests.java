package demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextboxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void successTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("Alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

    }
}
