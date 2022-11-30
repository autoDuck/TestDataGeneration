package utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class TestDate {
    Faker faker = new Faker();
    Random generator = new Random();

    String[] gender = {"Male", "Female", "Other"};

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress("ru");
    }

    public String getGender() {
        int randomIndex = generator.nextInt(gender.length);

        return gender[randomIndex];
    }

    public long getNumber() {
        return faker.number().randomNumber();
    }

    public String[] getDate() {
        SimpleDateFormat date = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
        String[] dateOfBirthday = date.format(faker.date().birthday()).split("\\s+");

        return dateOfBirthday;
    }

    public String getSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Maths");

        int randomIndex = generator.nextInt(subjects.size());

        return subjects.get(randomIndex);
    }
}
