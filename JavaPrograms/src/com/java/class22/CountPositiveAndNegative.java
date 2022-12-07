package com.java.class22;

public class CountPositiveAndNegative {
    public static void main(String[] args) {
        int data [] = {-12, 34,-45,45,54,-23,56,78,-2, 21 };
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                countPositive++;

            } else {
                countNegative--;
            }
        }
System.out.println("Negative count "+ countNegative);
System.out.println("Positive count "+ countPositive);
        }
    }
