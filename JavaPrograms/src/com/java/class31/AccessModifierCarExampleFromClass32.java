package com.java.class31;

import com.java.class32.Car;

public class AccessModifierCarExampleFromClass32 {
    public static void main(String[] args) {
        Car c = new Car();
        c.getSpeed(500);
        System.out.println(c.getSpeed());
        c.price = 3123;
        System.out.println(c.getSpeed());

    }
}
