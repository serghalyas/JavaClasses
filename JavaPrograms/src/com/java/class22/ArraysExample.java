package com.java.class22;

//Arrays - Container to hold more than one values of SIMILIAR data types

public class ArraysExample {
public static void main(String[] args) {

    //Declaration of array - Declaration will not initialize size in memory
    int [] data; // 4 bytes

    int a; // 4 Bytes

    //Initialize the array
    // In java when we want to initialize variable that can hold collections
    // of values we need to use new keyword
    data = new int [5];

    //Declaration and Initialization in same line
    int [] salary = new int [100]; // We do not know values so we initialize with maximum capacity

    //Declaration and assignment in the same line
    int [] nums = {10,20,30,34,45,23,45,23,12,65,23}; // We can assign fixed set of numbers

    //Length of the Array -> Total numbers of elements in the array
    System.out.println(nums.length);

    //Print value at particular index
    System.out.println(nums[4]);
    System.out.println("==========PRINT ALL DATA FROM ARRAY==========");
    for (int i = 0; i < nums.length; i++){
        System.out.println(nums[i]);
    }

    //Print default value of element of array
    System.out.println(salary[45]);// Output = 0;

    System.out.println(nums[21]);

    }
}
