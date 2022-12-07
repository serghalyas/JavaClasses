package com.java.class27;

class Car{
  static int numberOfCars ;

    Car(){
        numberOfCars++;

    }
}

public class Example {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car bmw = new Car();
        Car audi = new Car();

        System.out.println(Car.numberOfCars);


    }

}