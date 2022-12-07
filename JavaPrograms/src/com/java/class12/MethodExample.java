package com.java.class12;
import java.util.Scanner;
public class MethodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        printLineWithEqual();
        System.out.println("Welcome to the Calculator");
        printLineWithEqual();


        printLineWithHyphen();
        System.out.println("Please enter first number");
        printLineWithHyphen();
        int num1 = sc.nextInt();
        printLineWithHyphen();


        printLineWithHyphen();
        System.out.println("Please enter second number");
        printLineWithHyphen();;
        int num2 = sc.nextInt();


        printLineWithEqual();
        System.out.println("Here is your addition: " + " " + (num1 + num2));
        printLineWithEqual();

    }
    // Name of the method - printLineWithEqual
    // Return type - void
    // Parameter - () <-- no parameter
    // Method Body - System.out.println(-------------------);
    static void printLineWithEqual() {
        System.out.println("===============================");
    }

    static void printLineWithHyphen() {
        System.out.println("===============================");


    }

}