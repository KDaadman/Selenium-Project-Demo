package com.litigiven.tests;

import org.testng.annotations.Test;

public class Sington_Test {

    @Test
    public void singleton_understanding_test(){

        String str1 = Singleton_Approach.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton_Approach.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton_Approach.getWord();
        System.out.println("str3 = " + str3);

    }
}
