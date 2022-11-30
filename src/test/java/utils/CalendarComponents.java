package utils;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.*;

public class CalendarComponents {
    SelenideElement
            inputDate = $("#dateOfBirthInput"),
            listOfYear = $(".react-datepicker__year-select"),
            listOfMounth = $(".react-datepicker__month-select");

    public void setDate(String year, String month, String day) {
        inputDate.click();
        listOfYear.selectOption(year);
        listOfMounth.selectOption(month);
        $(".react-datepicker__day--0"+ day +":not(.react-datepicker__day--outside-month)");
    }
}
