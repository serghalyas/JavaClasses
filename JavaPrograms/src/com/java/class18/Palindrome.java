package com.java.class18;

import java.util.Scanner;

// Write a program to check given number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int rev = 0;
     int origNum = num;

     while ( num != 0){
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num/ 10 ;

     }


     if(num == rev) {
         System.out.println("Palindrome");
     }else{
         System.out.println("Not Palindrome");
     }


    }
}
