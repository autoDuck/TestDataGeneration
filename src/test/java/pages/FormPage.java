package pages;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FormPage {
    SelenideElement
                    inputFirstName = $("#firstName"),
                    inputLastName = $("#lastName"),
                    inputEmail = $("#userEmail"),
                    inputNumber = $("#userNumber");
    ElementsCollection
                    buttonGender = $$("#genterWrapper label");

    public FormPage setNameAndFamily(String firstName, String lastName) {
        inputFirstName.setValue(firstName);
        inputLastName.setValue(lastName);

        return this;
    }

    public FormPage setEmail(String email) {
        inputEmail.setValue(email);

        return this;
    }

    public FormPage setGender(String gender) {
        buttonGender.findBy(text(gender)).click();

        return this;
    }

    public FormPage setNumber(long number) {
        inputNumber.setValue(String.valueOf(number));

        return this;
    }
}
