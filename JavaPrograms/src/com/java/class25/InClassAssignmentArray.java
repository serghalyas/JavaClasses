package com.java.class25;
//Write a program to find the length of each word from the String
//Output
// Today - 5
// is - 2
//Monday, - 7
// started - 7
// well - 4
public class InClassAssignmentArray {
    public static void main(String[] args) {
        String str = "Today is Monday, it started well";
        String spaces[] = str.split(" ");

        for ( String word : spaces) {
            System.out.println(word + "=" + word.length());


        }
    }
}