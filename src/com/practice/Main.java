package com.practice;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(0,0,0);

        System.out.println("Bicycle cadence: "+bicycle.cadence + ", gear: "+bicycle.gear+" speed: "+bicycle.speed);

        bicycle.setCadence(30);
        bicycle.setGear(2);
    }
}
