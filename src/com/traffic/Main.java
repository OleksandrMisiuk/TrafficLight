package com.traffic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TrafficLight tl = new TrafficLight();
        tl.printState();
        while(tl.running) {
            tl.run();
            tl.printState();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
