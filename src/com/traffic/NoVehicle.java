package com.traffic;

public class NoVehicle extends Vehicle {

    // Default Constructor
    public NoVehicle() {
        super(0
//                , false
        );
    }

    // Getters
    public int getTime() {
        return time;
    }

    // To String
    public String toString() {
        return " ";
    }

}