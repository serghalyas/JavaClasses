package com.java.class28;


    class InheritanceClassAssignment {
     public void ifFirstNumGreater(int a, int b) {
         if (a > b) {
             System.out.println(a);
         }else{
             System.out.println(b);

            }
         }

    static class Compare2 extends InheritanceClassAssignment {

    public void ifSecondNumberIsGreater(int a, int b) {
        if (b > a) {
            System.out.println(b);

        } else {
            System.out.println(a);
        }

        }
    }
}
