package com.java.class21;

import java.util.Scanner;

public class HwOctNov3rd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       1) Java Program to count the total number of vowels and consonants in a string
//          Example
//          Input - Today is Saturday
//          Output - Total Vowels - 6, Total Consonants -  9
//       STEPS
//        1. Read a sentence from the user
//        2. Create a variable (count) initialize it with 0;
//        3. Compare each character in the sentence with the characters {'a', 'e', 'i', 'o', 'u' }
//        4. If a match occurs increment the count.
//        5. Finally print count.

//        System.out.println("Please input your string: ");
//        String userInput = sc.nextLine();
//
//        int vowelCount = 0;
//        int consonantsCount = 0;
//
//        for (int i = 0; i < userInput.length(); i++) {
//
//            char takeCompare = userInput.charAt(i);
//
//            if (takeCompare == 'a' || takeCompare == 'e' || takeCompare == 'i' || takeCompare == 'o' || takeCompare == 'u') {
//                vowelCount++;
//
//            } else {
//                    consonantsCount++;
//                }
//            }
//            System.out.print("Total vowels - " + vowelCount);
//            System.out.print(" ,Total Consonants - " + consonantsCount);
//        }
//    }

//2. Java Program to remove all the white spaces from a string
//        Example
//        Input - Today is Saturday
//        Output - TodayisSaturday

//        System.out.println("Please input your string: ");
//        String userInput = sc.nextLine();
//
//        String trimmedInput = userInput.replace(" ", "");
//        System.out.println(trimmedInput);
//
//    }
//}

//3. Java Program to determine whether a given string is palindrome or not by ignoring the case of characters and white spaces
//        Example
//        Input - Was it a car or a ct Ia saw
//        Output - Palindrome (edited)

        System.out.println("Please input your string: ");
        String origString = sc.nextLine().toLowerCase().replace(" ", "");
        String reverseInput ="";

        for (int i = 0; i <= origString.length(); i++) {
            reverseInput = reverseInput + origString.charAt(i);

            if (origString.equals(reverseInput)) {
                System.out.println("Palindrome");

            } else {
                System.out.println("Not Palindrome");
            }
        }

        }
    }
