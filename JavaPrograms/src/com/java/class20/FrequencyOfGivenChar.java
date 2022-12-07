package com.java.class20;

import java.util.Scanner;

//Write a program to find frequency of given character in the string
// Hello, How are you?
// e
// Output - 2
public class FrequencyOfGivenChar {
    public static void main(String[] args) {
        String str = "Hello, How are you?";

        System.out.print("Numer of o's: ");

        System.out.print(getNumberOfE(str));

    }

    static int getNumberOfE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }
}
