package com.java.class26;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Book {
    String checkOutCode;
    double balance;
    double discount;
    double dailyBookRate = .30;

    Book(String bookName, String author, int yearPublished, int pages) {
        checkOutCode = bookName.replace(" ", "") + yearPublished + pages;

    }
    void bookName() {
        System.out.println("Story of my first constructor");
    }
    void makePriceFree() {
        balance = 0;
        System.out.println("Your balance is: "+"$"+ balance+ " , come back and read more!");
    }


    void bookRental() {
        Scanner sc = new Scanner(System.in);
        int amountOfDays = sc.nextInt();

        if (amountOfDays <= 5) {
            balance = balance + amountOfDays * dailyBookRate;
            System.out.println("You will owe $" + balance);
            System.out.println("Your Check out code: " + checkOutCode);
        } else {
            System.out.println("The book can only be check out for less than 5 days");

        }



    }
}