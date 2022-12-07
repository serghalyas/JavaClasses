package com.java.class18;

import java.util.Scanner;

public class FindFactorsOfGivenNumber {
    public static void main(String[] args) {
// Factor of 6 - 1, 2, 3,6
// Factor of 10 - 1 , 2 , 5 , 10


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number ");
        int num = sc.nextInt();

        for ( int divisible = 1; divisible <= num; divisible++) {

            if (num % divisible == 0) {
                System.out.println(divisible);

            }


        }
    }

}
