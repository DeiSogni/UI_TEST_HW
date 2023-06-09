package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsTableComponent {
    SelenideElement
    registrationResponse = $(".modal-content"),
            tableResult = $(".table-responsive");

    public void checkRegistrationResponse() {
        registrationResponse.shouldHave(text("Thanks for submitting the form"));
    }
    public void checkTableResult(String nameElement, String value) {
        tableResult.find(byText(nameElement)).sibling(0).shouldHave(text(value));
    }
}
