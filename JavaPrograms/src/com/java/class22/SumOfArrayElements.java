package com.java.class22;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 34, 45, 23, 45, 23};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + nums[i];

        }
        System.out.println("Sum of all elements: " + count);
    }
}