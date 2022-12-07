package com.java.class29;


// You call a constructor from another constructor only
// You can call another constructor from another constructor,
// as long as it is on the first line ONLY

class Bank {
    Bank(){
        System.out.println("From Bank");
    }

    Bank (int balance){
        this();
        System.out.println("From Bank " + balance);
    }
    void callConstructor () {

    }
}

public class ThisAndSuperWithConstructor {
    public static void main(String[] args) {


        Bank b = new Bank (543);


    }
}