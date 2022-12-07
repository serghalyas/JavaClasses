package com.java.class22;
// Write a program to find index of the number
// 12 ,34,56,23,76, 33, 76, 32, 21
// 76
//Output will be = 4
public class FindIndexOfNumber {
    public static void main(String[] args) {
        int[] data = {12, 34, 56, 23, 76, 33, 74, 32, 21};
        int targetNum = 76;
        System.out.println(findIndex(data, targetNum));


    }

    static int findIndex(int[] data, int targetNumber) {
        int indexOfNum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetNumber) {
                indexOfNum = i;

            }
        }
    return indexOfNum;
    }
}

