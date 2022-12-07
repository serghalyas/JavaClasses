package com.java.class25;

public class PrintAllForEachLoop {
    public static void main(String[] args) {
        int nums[][] = {{23, 44, 21}, {45, 42, 31}, {74, 14, 0}};

        for(int [] eachRow: nums) {
            for(int j : eachRow){
                System.out.println(j);

            }
        System.out.println();
        }
    }
}
