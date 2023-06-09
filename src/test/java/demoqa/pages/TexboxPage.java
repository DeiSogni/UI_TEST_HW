package demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TexboxPage {

    SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit"),
            nameResult = $("#output #name"),
            emailResult = $("#output #email"),
            currentAddressResult = $("#output #currentAddress"),
            permanentAddressResult = $("#output #permanentAddress");

    public TexboxPage openPage() {
        open("/text-box");

        return this;
    }
    public TexboxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TexboxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TexboxPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public TexboxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }
    public TexboxPage submit() {
        submitButton.click();
        return this;
    }
    public void checkResult(String name, String email, String currentAddress, String permanentAddress){
        nameResult.shouldHave(text(name));
        emailResult.shouldHave(text(email));
        currentAddressResult.shouldHave(text(currentAddress));
        permanentAddressResult.shouldHave(text(permanentAddress));

    }

}
