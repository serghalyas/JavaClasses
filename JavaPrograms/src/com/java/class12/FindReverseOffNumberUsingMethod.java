package com.java.class12;
import java.util.Scanner;
public class FindReverseOffNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number 100-999");
        int num = sc.nextInt();

        int rev= 0;

        int lastDigit = num % 10;

        rev = rev * 10 +lastDigit;

        num = num/10;




}

}
