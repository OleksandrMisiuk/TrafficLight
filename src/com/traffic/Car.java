package com.traffic;

public class Car extends Vehicle {

    // Default Constructor
    public Car() {
        super(8
//                , false
        );
    }

    // Getters
    public int getTime() {
        return time;
    }

    // To String
    public String toString() {
        return "C";
    }

}