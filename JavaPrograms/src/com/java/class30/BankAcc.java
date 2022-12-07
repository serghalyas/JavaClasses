package com.java.class30;

class Bank {
    int balance;

    void deposit( int amount ) {
        balance = balance + amount;

    }
    void displayRateOfInterest () {
        System.out.println("4%");

    }

}

class ChaseBank extends Bank {

}

class BankpOfAmerica extends Bank {

}

class CitiBank extends Bank {

}

public class BankAcc{
    public static void main(String[] args) {
        ChaseBank c  = new ChaseBank ();
        BankpOfAmerica ba = new BankpOfAmerica();
        c.displayRateOfInterest();

    }
}