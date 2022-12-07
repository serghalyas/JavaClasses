package com.java.class20;

import java.util.Scanner;

// Write a program to take String from user using Scanner class
// Count the number of spaces from the String
// Print String is small if number of spaces less than 5.
// Print String is medium if number of spaces greater than or equals to 5 and less than 10
// Print String is large if number of spaces greater than 10.
public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a string: ");
        String str1 = sc.nextLine();

        System.out.println(getNumberOfSpaces(str1));


        int count = getNumberOfSpaces(str1);

        if (count > 10) {
            System.out.println("Long");
        } else if (count >= 5) {
            System.out.println(" medium");

        } else {
            System.out.println("Short");
        }
    }


    static int getNumberOfSpaces(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

}