package com.litigiven.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerDemo {

    @Test
    public void java_faker_test() {

        // create Java Faker object
        Faker faker = new Faker();

        //Print out a random first name using Faker object

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        // print out a random last name using Faker
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        //print out a full name

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // print out street address
        System.out.println("faker.address().streetAddress() = " + faker.address().streetAddress());

        // print out a city
        System.out.println("faker.address().cityName() = " + faker.address().cityName());

        System.out.println("faker.address().city() = " + faker.address().city());

        //print out zipcode
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        // numerify() method is used to generate digits with specific format
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####")); // all number will be dynamic

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("512-###-####")); // the first part will be static, and the rest will be dynamic

        // print out random generated numbers
        System.out.println("faker.number().randomNumber() = " + faker.number().randomNumber());

        //letterify() method is userd to generate RANDOM letters with specific formatting.
        System.out.println("faker.letterify(\"????-????-????\") = " + faker.letterify("????-????-????"));

        //bothify() method is used to generate both letters and digits randomly
        System.out.println("faker.bothify(\"?##?#?-##??#-????##\") = " + faker.bothify("?##?#?-##??#-????##"));


        //chuckNorris() method  is used to create chuckNorris facts.
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.Mukhtar().fact().replace(\"Chuck Norris\",\"Mukhtar\") = " + faker.chuckNorris().fact().replace("Chuck Norris", "Mukhtar"));
    }
}
