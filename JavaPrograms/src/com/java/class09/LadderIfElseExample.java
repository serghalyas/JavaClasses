package com.java.class09;
//Write a program to get age and weight from the user
//1. user has age more than or equal to 18 and weight more than equal to 50 than they are eligible for blood donation
//2. If user has age less than 18 and weight greater than 50 than print you're too young to donate blood
//3. If user has age greater than 18 and weight less than 50 than print you're underweight
//4. If user has age less than 19 and weight less than 50 then print your not eligible
import java.util.Scanner;
public class LadderIfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your age ");
        int age = scanner.nextInt();
        System.out.println("Please put in your weight ");
        double weight = scanner.nextDouble();

        if ( age>=18 && weight >= 50 ) {
            System.out.println("You are eligible for blood donation");

        }else if (age<18 && weight > 50){
            System.out.println("you're too young to donate blood");

        }else if (age>18 && weight < 50){
            System.out.println("you're underweight");

        }else if (age<19 && weight < 50) {
            System.out.println("your not eligible");

        }else{

            System.out.println("Please follow directions");

            // 2nd approach - nested if-else
            //        if(age >=18){
            //            if(weight >=50){
            //                System.out.println("You're eligible");
            //            }else{
            //                System.out.println("you're underweight");
            //            }
            //        }else{
            //            if(weight >=50){
            //                System.out.println("you're too young to donate blood");
            //            }else{
            //                System.out.println("you're not eligible");





        }

    }
}
