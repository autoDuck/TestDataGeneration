package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.FormPage;
import utils.CalendarComponents;
import utils.TestDate;

public class PreconditionsForAllTests {
    FormPage formPage = new FormPage();
    TestDate testDate = new TestDate();
    CalendarComponents calendarComponents = new CalendarComponents();

    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
}
