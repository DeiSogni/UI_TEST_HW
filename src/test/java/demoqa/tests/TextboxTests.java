package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.pages.TexboxPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextboxTests extends TestBase {

    TexboxPage TextboxPage = new TexboxPage();

    String name = "Alex Egorov",
           email = "Alex@Egorov.com",
           currentAddress = "Some address 1",
           permanentAddress = "Another address 1";


    @Test
    void successTest() {
        TextboxPage.openPage()
                   .setUserName("Alex Egorov")
                   .setUserEmail("Alex@Egorov.com")
                   .setCurrentAddress("Some address 1")
                   .setPermanentAddress("Another address 1")
                   .submit()
                   .checkResult(name, email, currentAddress, permanentAddress);





    }
}
