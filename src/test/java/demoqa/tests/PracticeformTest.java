package demoqa.tests;

import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;


public class PracticeformTest extends TestBase{

    @Test
    void uiTest() {



        registrationPage.openPage()

        .setFirstName(dataRandoms.firstName)
        .setLastName(dataRandoms.lastName)
        .setUserEmail(dataRandoms.userEmail)
        .setGender(dataRandoms.gender)
        .setUserNumber(dataRandoms.phoneNumber)
        .setBirthDay(dataRandoms.birthDay, dataRandoms.mountBirth, dataRandoms.yearBirth)
        .setSubjects(dataRandoms.subject)
        .setHobbies(dataRandoms.hobby)
        .uploadPicture(dataRandoms.imagePng)
        .setCurrentAddress(dataRandoms.address)
        .setState(dataRandoms.state)
        .setCity(dataRandoms.city)
        .submit();

        registrationPage.checkResponse()

        .checkResult("Student Name", dataRandoms.firstName + " " + dataRandoms.lastName)
        .checkResult("Student Email", dataRandoms.userEmail)
        .checkResult("Gender", dataRandoms.gender)
        .checkResult("Mobile", dataRandoms.phoneNumber)
        .checkResult("Date of Birth", dataRandoms.birthDay + " " + dataRandoms.mountBirth +
                "," + dataRandoms.yearBirth)
        .checkResult("Subjects", dataRandoms.subject)
        .checkResult("Hobbies", dataRandoms.hobby)
        .checkResult("Picture", dataRandoms.imagePng)
        .checkResult("Address", dataRandoms.address)
        .checkResult("State and City", dataRandoms.state + " " + dataRandoms.city);

        registrationPage.closeModal();

    }

}
