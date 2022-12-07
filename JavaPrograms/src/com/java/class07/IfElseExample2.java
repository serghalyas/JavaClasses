package com.java.class07;
// write a program to take age from user and print weather they are eligible for driver license or not
import java.util.Scanner;
public class IfElseExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int eligbl = 16;

        System.out.println("Please input your age: ");
        age = sc.nextInt();


        if (age < eligbl) {
            System.out.println("You are not eligible");

        }else{
            System.out.println("You are eligible");





        }
    }
}
