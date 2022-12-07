package com.java.class06;

import java.util.Scanner;

public class ConvertAgeFromYearsToDaysMonthsMins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Good afternoon, How old are you?");
        int a = sc.nextInt();

        int months = (a * 12);
        System.out.println("In months" + " " + months);

        int days = (a * 365);
        System.out.println("You have spent " + days + " days on earth");

        long mins = ((a * 365 * 24 * 60));
        System.out.println("You have spent " + mins + " mins on earth");




    }

}
