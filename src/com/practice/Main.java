package com.practice;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(0,0,0);

        System.out.println("Bicycle situation: "+bicycle.toString());

        bicycle.setCadence(30);
        bicycle.setGear(2);
        bicycle.speedUp(10);

        System.out.println("Bicycle situation: "+bicycle.toString());
    }
}
