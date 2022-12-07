package com.java.class21;

import java.util.Scanner;

public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to find the length of the string
        System.out.println("User, please input a string: ");
        String usrInput = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= usrInput.length(); i++) {
            count++;

        }
        System.out.println(count);
    }
}
