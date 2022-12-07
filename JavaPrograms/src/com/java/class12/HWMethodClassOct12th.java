package com.java.class12;
import java.util.Scanner;
public class HWMethodClassOct12th {
    public static void main(String[] args) {
//========= Homework ========
        // Write a program to check given number is odd or even using function

//        Scanner sc = new Scanner(System.in);
//        int getNumber;
//
//        System.out.println("Please input number: ");
//        getNumber = sc.nextInt();
//
//        getOddEven(getNumber);
//
//    }
//    static void getOddEven (int getNumber){
//            if (getNumber % 2 == 0) {
//                System.out.println("Your number is even");
//
//            } else { System.out.println("Your number is odd");
//
//            }
//
//        }
//
//    }


//1. Write a program to take three numbers from user and find reverse of the greatest number (3-digit number)

        Scanner sc = new Scanner(System.in);
        printLine();
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();

        printLine();

        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();

        printLine();

        System.out.println("Please enter the third number: ");
        int num3 = sc.nextInt();

        int largestNumber = 0;


        if (num1 > num2 && num1 > num3) {
            largestNumber = num1;
        }

        if (num2 > num3) {
            largestNumber = num2;
        } else if (num3 > num2 && num3 > num1) {
            largestNumber = num3;
        }

        printStar();

        System.out.println("Largest number is: " + largestNumber);

        int reverse = 0;
        int remainder;


        while (largestNumber != 0) {

            remainder = largestNumber % 10;
            reverse = reverse * 10 + remainder;
            largestNumber = largestNumber / 10;

        }

        printStar();

        System.out.println("The reverse of a given number is : " + reverse);

        printStar();

    }

    static void printLine() {
        System.out.println("====================================================");
    }

    static void printStar() {
        System.out.println("******************************************************");

        System.out.println("");
    }
}


