package com.java.class18;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int divisor = 0;

        for (int i = 2; i < input; i++) {

            if (input % i == 0) {
                System.out.println(i);
                divisor++;


            }
        }

          if ( divisor == 0) {
              System.out.println("Prime");

          }else{
              System.out.println("Not Prime");


        }
    }
}
