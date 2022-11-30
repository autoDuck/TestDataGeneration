package tests;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;

public class DemoQaFormTest extends PreconditionsForAllTests{
    @Test
    public void checkForm() {
        open("/automation-practice-form");
        formPage.setNameAndFamily(testDate.getFirstName(), testDate.getLastName())
                .setEmail(testDate.getEmail())
                .setGender(testDate.getGender())
                .setNumber(testDate.getNumber());

        calendarComponents.setDate(testDate.getDate()[2], testDate.getDate()[1], testDate.getDate()[0]);
    }
}
