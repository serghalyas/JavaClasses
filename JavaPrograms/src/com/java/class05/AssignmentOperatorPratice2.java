package com.java.class05;

public class AssignmentOperatorPratice2 {
    public static void main(String[] args) {
        int a = 10, b = 15;

        a = a * a; // a = 100
        b = a * b; // b = 100 * 15 -> 1500

        b = a + b; // b = 100 + 1500 -> 1600
        a = a + b; // b = 100 + 1600 -> 1700


        System.out.println(a);
        System.out.println(b);
    }
}
