package demoqa.utils;

import com.github.javafaker.Faker;

import java.util.*;

public class DataRandoms {
    Faker faker = new Faker();

   public String firstName = faker.name().firstName();
   public String lastName = faker.name().lastName();
   public String userEmail = faker.internet().emailAddress();
   public String gender = faker.options().option("Male", "Female", "Other");
   public String phoneNumber = faker.number().digits(10);
   public String birthDay = setRandomDay();
   public String mountBirth = faker.options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December");
   public String yearBirth = String.valueOf(faker.number().numberBetween(1900, 2020));
   public String subject = faker.options().option("Math", "English", "Chemistry", "Civics", "Computer Science", "Arts", "Physics", "Economics");
   public String hobby = faker.options().option("Sports", "Reading", "Music");
   public String imagePng = "new.png";
   public String address = faker.address().fullAddress();
   public String state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
   public String city = getRandomCity(state);

    public String setRandomDay() {
        int day = faker.number().numberBetween(1, 30);
        if (day < 10) {
            return "0" + day;
        } else {
            return day + "";
        }
    }
    public String getRandomCity(String state) {
        String city = null;
        List<String> citiesNCR = Arrays.asList("Delhi", "Gurgaon", "Noida");
        List<String> citiesUttarPradesh = Arrays.asList("Agra", "Lucknow", "Merrut");
        List<String> citiesHaryana = Arrays.asList("Karnal", "Panipat");
        List<String> citiesRajasthan = Arrays.asList("Jaipur", "Jaiselmer");

        switch (state) {
            case "NCR":
                city = citiesNCR.get(faker.random().nextInt(0, citiesNCR.size() - 1));
                break;
            case "Uttar Pradesh":
                city = citiesUttarPradesh.get(faker.random().nextInt(0, citiesUttarPradesh.size() - 1));
                break;
            case "Haryana":
                city = citiesHaryana.get(faker.random().nextInt(0, citiesHaryana.size() - 1));
                break;
            case "Rajasthan" :
                city = citiesRajasthan.get(faker.random().nextInt(0, citiesRajasthan.size() - 1));
        }
        return city;
    }
}




