package com.java.class12;

import java.util.Scanner;

public class broJavaMethods {
    public static void main(String[] args) {
        //method = a block of code that is executed whenever it is called upon
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please input the first number: ");
//        int x = sc.nextInt();
//
//        lineSep();
//
//        System.out.println("Please input the second number: ");
//        int y = sc.nextInt();
//
//        lineSep();
//
//       System.out.println(mathOption(x,y));
//
//        lineEnding();
//
//
//    }
//
//
//    static int mathOption(int x, int y) {
//
//        return x + y;
//
//    }
//
//    static void lineSep(){
//        System.out.println("================================");
//    }
//
//    static void lineEnding(){
//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//    }


        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Please enter your name: ");
        String name = sc.next();

        printNameAge(age,name);

    }

    static void printNameAge(int age, String name){
        System.out.println("Your age is " + age + " & " + "Your name is " +  name);
        return;

    }
}
