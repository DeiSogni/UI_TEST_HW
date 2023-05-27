package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextboxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1900x1080";
    }


    @Test
    void FirstUiTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");

    }
}
