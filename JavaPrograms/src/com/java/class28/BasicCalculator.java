package com.java.class28;

 class BasicCalculator {

    public void sum(int a, int b) {
        System.out.println(a + b);

    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

}

class advancedCalculator extends BasicCalculator{
    public void mult(int a, int b) {
        System.out.println(a * b);

    }
    public void div(int a, int b) {
        System.out.println(a / b);

    }
 }