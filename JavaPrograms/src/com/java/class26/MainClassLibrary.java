package com.java.class26;

import java.util.Scanner;

public class MainClassLibrary {
    public static void main(String[] args) {


        Book book1 = new Book("A Heart That Works", "Rob Delaney",
                2002, 196);

        Book book2 = new Book("The Westing Game", "Ellen Raskin",
                2021, 192);

        Book book3 = new Book ("The Book Thief", "Markus Zusak",
                2007,608);


        book1.bookRental();

        System.out.println("--------------------------------------");
        book2.bookRental();

        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println("Holiday special, enjoy a month of November for free! ");
        System.out.println();

        System.out.println("--------------------------------------");

        System.out.println(book2.checkOutCode);
        book2.makePriceFree();

        System.out.println("--------------------------------------");

        System.out.println(book1.checkOutCode);
        book1.makePriceFree();

        System.out.println("--------------------------------------");

        book3.bookName();




    }

}
