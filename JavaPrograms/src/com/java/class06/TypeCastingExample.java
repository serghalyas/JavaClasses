package com.java.class06;

import java.util.Scanner;

public class TypeCastingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input 10,20,30
        System.out.println("Please enter first number ");
        int a = sc.nextInt();

        System.out.println("Please enter second number ");
        int b = sc.nextInt();

        System.out.println("Please enter third number ");
        int c = sc.nextInt();

        int result = ((10 + 20 + 30) / 3);

        System.out.println("Average" +" "+ result);


    }

}
