package com.java.class18;

public class PatternPractice1 {
    public static void main(String[] args) {


        for (int row = 1; row < 5; row++) {

            for (int spc = 1; spc <= 5 - row; spc++) {

                System.out.print(" ");

            }
            for (int colm = 1; colm <= 2 * row - 1; colm++) {

                System.out.print("$");
            }
            System.out.println();
        }
      for (int row = 5; row >= 1 ; row--) {

            for (int spc = 1; spc <=  5 - row  ; spc++) {

                System.out.print(" ");

            }
            for (int colm = 1; colm  <= row * 2 - 1   ; colm++) {

                System.out.print("A");
            }
            System.out.println();
        }
    }
}