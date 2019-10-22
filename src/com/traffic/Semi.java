package com.traffic;

public class Semi extends Vehicle {

    // Default Constructor
    public Semi() {
        super(7
//                , false
        );
    }

    // Getters
    public int getTime() {
        return time;
    }

    // To String
    public String toString() {
        return "S";
    }

}