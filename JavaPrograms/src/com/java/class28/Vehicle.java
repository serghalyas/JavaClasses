package com.java.class28;

public class Vehicle {
    Vehicle(){
        System.out.println("From vehicle");
    }

}

class Car extends Vehicle {
    Car(){
        System.out.println("From car");
    }

}
class SportsCar extends Car  {
    SportsCar () {
        System.out.println("From sports Car");
    }
}