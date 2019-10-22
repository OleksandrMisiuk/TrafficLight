package com.traffic;

public class Truck extends Vehicle {

    // Default Constructor
    public Truck() {
        super(12
//                , false
                );
    }

    // Getters
    public int getTime() {
        return time;
    }

    // To String
    public String toString() {
        return "T";
    }

}
