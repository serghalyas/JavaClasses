package com.java.class09;
import java.util.Scanner;
public class NestedIfElseExample2 {
    // Get salary & age
    // 1. If age is less than 18 then print youre not eligible
    //2. If age is more than or equal to 18 and salary is less than 5,000 than print "Sorry, you need to work hard to get credit card.
    //3. If age is more than or equal to 18 and salary is greater than or equal to 50,000 then print you're eligible.
    //4. If age is more than or equal 18 and salary is greater than 20,000 than print "You will get free credit card"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age ");
        int age = scanner.nextInt();


        System.out.println("Please enter your salary: ");
        int salary = scanner.nextInt();

        if (age < 18) {
            System.out.println("You are too young");

        } else {

            if (salary >= 20_000) {

                System.out.println("you will get free credit card");

            } else if (salary < 5_000) {

                System.out.println("Work Hard");

                } else {

                System.out.println("You're eligible");


            }

        }
    }
}



