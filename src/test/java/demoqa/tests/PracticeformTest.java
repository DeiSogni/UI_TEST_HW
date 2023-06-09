package demoqa.tests;

import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;


public class PracticeformTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void uiTest() {

        registrationPage.openPage()

        .setFirstName("Alex")
        .setLastName("Egorov")
        .setUserEmail("Alex@egorov.com")
        .setGender("Male")
        .setUserNumber("8888888888")
        .setBirthDay("30", "July", "2008")
        .setSubjects("English")
        .setSubjects("History")
        .setHobbies("Sports")
        .setHobbies("Reading")
        .setHobbies("Music")
        .uploadPicture("new.png")
        .setCurrentAddress("Moscow")
        .setState("NCR")
        .setCity("Delhi")
        .submit();

        registrationPage.checkResponse()

        .checkResult("Student Name","Alex Egorov")
        .checkResult("Student Email","Alex@egorov.com")
        .checkResult("Gender","Male")
        .checkResult("Mobile","8888888888")
        .checkResult("Date of Birth","30 July,2008")
        .checkResult("Subjects","English, History")
        .checkResult("Hobbies","Sports, Reading, Music")
        .checkResult("Picture","new.png")
        .checkResult("Address","Moscow")
        .checkResult("State and City","NCR Delhi");

        registrationPage.closeModal();

    }

}
