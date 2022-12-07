package com.java.class17;

import java.util.Scanner;

public class NestedForLoopExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      for ( int row = 1; row <= 5; row++) {
          for (int column = 1; column <= 5 - row + 1  ; column++) {

              int value = 5 - column +1;
              System.out.print(value);


          }
          System.out.println();


            }
        }
    }
