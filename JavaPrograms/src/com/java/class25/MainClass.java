package com.java.class25;

public class MainClass {
    public static void main(String[] args) {
        //Create and Initialize Object
        Bank acc1 = new Bank ();
        Bank acc2 = new Bank ();
        acc1.balance = 1000;
        acc1.accName = "Chiraq";

        acc2.accName = "Jadia";
        acc2.balance = 5000;

        acc1.deposit(3000);
        acc2.withDraw(4000);

        System.out.println(acc1.balance);
        System.out.println(acc2.balance);

        Garage myCar1 = new Garage();


        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.year);
        System.out.println(myCar1.transmission);
        System.out.println(myCar1.horsePower);
        System.out.println(myCar1.engineSize);


        System.out.println();

        myCar1.drive();
        myCar1.drift();
        myCar1.isWeekendCar();


    }
}
