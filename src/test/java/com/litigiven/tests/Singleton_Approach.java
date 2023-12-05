package com.litigiven.tests;

public class Singleton_Approach {

    // 1- Create a private constructor
    private Singleton_Approach() {}

    // 2- Private Static String
    private static String word; // by default word is null


    // 3- Utility method to return the 'private String' we just created.
    public static String getWord(){
        if(word == null) {
            System.out.println("word value = " + word);
            System.out.println("First time Call: Word object is null.");
            System.out.println("Assigning value to it now.");
            word = "something";


        } else {
            System.out.println("Word already has a value.");
        }

        return word;
    }
}
