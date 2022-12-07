package com.java.class08;

import java.util.Scanner;

public class FindGreatestNUmberOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
            int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3)
          //  30 >= 50 &&  30 >= 70 = False
            // That is not the the case so we will use else if
            System.out.println("maximum number:" +num1);
        else if (num2 >= num1 && num2 >= num3)
            //  50 >= 30 && 50 >= 70 = True
            System.out.println("maximum number:" +num2);
        else
            System.out.println("maximum number:" +num3);
    }
}
