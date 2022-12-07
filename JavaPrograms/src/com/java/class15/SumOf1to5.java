package com.java.class15;

import java.util.Scanner;

public class SumOf1to5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter number: ");
    int num = sc.nextInt();
    int result = 1 ;



        for (int i = 1; i <= 5; i++) {

            result = result * i;

        }

    System.out.println(result);

    }
}