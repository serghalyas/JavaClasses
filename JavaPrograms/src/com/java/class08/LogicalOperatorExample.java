package com.java.class08;
//Logical operator works with boolean value
public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean b1= true, b2=false, b3=true, b4= false;

        // AND has a higher priority than OR
        // standard equation rules apply ( ) first



        System.out.println(b1 || b2);
        System.out.println(b1 && b2);
        System.out.println(b1 || b2 && b3);
        System.out.println(b1 && b2 || b3);
        System.out.println(b1 && (b2 || b3) && (b4 ||b1) &&b3);
        System.out.println(b1 && (b2 || b3) && (b4 || b2) &&b3);
        //                T    &&   T        &&      F   &&    T






    }
}
