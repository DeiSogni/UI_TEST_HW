package demoqa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeformTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }


    @Test
    void UiTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Egorov");
        $("#userEmail").setValue("Alex@egorov.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8888888888");

        $("#dateOfBirth-wrapper").$("#dateOfBirthInput").click();
        $("#dateOfBirth-wrapper").$(".react-datepicker__month-select").click();
        $("#dateOfBirth-wrapper").$(byText("September")).click();
        $("#dateOfBirth-wrapper").$(".react-datepicker__year-select").click();
        $("#dateOfBirth-wrapper").$(byText("1995")).click();
        $(".react-datepicker__day--022").click();

        $("#subjectsInput").setValue("E");
        $(byText("English")).click();
        $("#subjectsInput").setValue("H");
        $(byText("History")).click();


        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("#uploadPicture").uploadFile(new File("src/test/resources/new.png"));

        $("#currentAddress").setValue("Moscow");

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        $(byText("Thanks for submitting the form")).shouldBe(Condition.visible);
        $(byText("Alex Egorov")).shouldBe(Condition.visible);
        $(byText("Alex@egorov.com")).shouldBe(Condition.visible);
        $(byText("Male")).shouldBe(Condition.visible);
        $(byText("8888888888")).shouldBe(Condition.visible);
        $(byText("22 September,1995")).shouldBe(Condition.visible);
        $(byText("English, History")).shouldBe(Condition.visible);
        $(byText("Sports, Reading, Music")).shouldBe(Condition.visible);
        $(byText("new.png")).shouldBe(Condition.visible);
        $(byText("Moscow")).shouldBe(Condition.visible);
        $(byText("NCR Delhi")).shouldBe(Condition.visible);


    }
}
