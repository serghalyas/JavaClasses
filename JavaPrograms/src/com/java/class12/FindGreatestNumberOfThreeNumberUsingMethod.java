package com.java.class12;

import java.util.Scanner;

public class FindGreatestNumberOfThreeNumberUsingMethod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Please enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("Please enter third number: ");
            int num3 = sc.nextInt();

            printGreatestNumFromThree(num1,num2,num3);

        }
        //Method with arguments but no return value
        static void  printGreatestNumFromThree (int a, int b, int c){
                System.out.println();
            if (a >=b && a >= c)
                //  30 >= 50 &&  30 >= 70 = False
                // That is not the the case so we will use else if
                System.out.println("maximum number: " + a);
            else if (b >= c)
                //  50 >= 30 && 50 >= 70 = True
                System.out.println("maximum number: " + b);
            else
                System.out.println("maximum number: " + c);
            }

        }



