package com.java.class21;

import java.util.Scanner;

public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the string: ");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(i);
            }
        }
    }

