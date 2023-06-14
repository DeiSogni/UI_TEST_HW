package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.CalendarComponent;
import demoqa.pages.components.ResultsTableComponent;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {


        CalendarComponent calendarComponent = new CalendarComponent();
        ResultsTableComponent resultsTableComponent = new ResultsTableComponent();
        SelenideElement
                firstNameInput = $("#firstName"),
                lastNameInput = $("#lastName"),
                userEmailInput = $("#userEmail"),
                genderWrapper = $("#genterWrapper"),
                userNumberInput = $("#userNumber"),
                birthDayInput = $("#dateOfBirthInput"),
                subjectsInput = $("#subjectsInput"),
                hobbiesInput = $("#hobbiesWrapper"),
                uploadPicture = $("#uploadPicture"),
                currentAddressInput = $("#currentAddress"),
                stateInput = $("#stateCity-wrapper").$("#state"),
                cityInput = $("#stateCity-wrapper").$("#city"),
                submitButton = $("#submit"),
                closeButton = $("#closeLargeModal");


        public RegistrationPage openPage() {
                open("/automation-practice-form");
                $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
                closeBanners();
                return this;
        }


        public RegistrationPage setFirstName(String value) {
                firstNameInput.setValue(value);
                return this;
        }

        public RegistrationPage setLastName(String value) {
                lastNameInput.setValue(value);

                return this;
        }

        public RegistrationPage setUserEmail(String value) {
                userEmailInput.setValue(value);
                return this;
        }

        public RegistrationPage setGender(String value) {
                genderWrapper.$(byText(value)).click();
                return this;
        }

        public RegistrationPage setUserNumber(String value) {
                userNumberInput.setValue(value);
                return this;
        }

        public RegistrationPage setBirthDay(String day, String month, String year) {
                birthDayInput.click();
                calendarComponent.setDate(day, month, year);
                return this;
        }

        public RegistrationPage setSubjects(String value) {
                subjectsInput.setValue(value).pressEnter();
                return this;
        }

        public RegistrationPage setHobbies(String value) {
                hobbiesInput.$(byText(value)).click();
                return this;
        }

        public RegistrationPage uploadPicture(String value) {
                uploadPicture.uploadFromClasspath(value);
                return this;
        }

        public RegistrationPage setCurrentAddress(String value) {
                currentAddressInput.setValue(value);
                return this;
        }

        public RegistrationPage setState(String value) {
                stateInput.click();
                stateInput.$(byText(value)).click();
                return this;
        }

        public RegistrationPage setCity(String value) {
                cityInput.click();
                cityInput.$(byText(value)).click();
                return this;

        }

        public RegistrationPage submit() {
              submitButton.click();
                return this;
        }
        public RegistrationPage checkResponse() {
                resultsTableComponent.checkRegistrationResponse();
                return this;
        }
        public RegistrationPage checkResult(String nameElement, String value) {
                resultsTableComponent.checkTableResult(nameElement, value);
                return this;
        }
        public RegistrationPage closeModal() {
                closeButton.click();
                return this;
        }
        private void closeBanners() {
                executeJavaScript("$('#fixedban').remove()");
                executeJavaScript("$('footer').remove()");
        }
}
