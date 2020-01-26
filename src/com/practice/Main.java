package com.practice;

public class Main {

    public static void main(String[] args) {
//        Bicycle bicycle = new Bicycle(0,0,0);
//
//        System.out.println(bicycle.toString());
//
//        bicycle.setCadence(30);
//        bicycle.setGear(2);
//        bicycle.speedUp(10);
//
//        System.out.println(bicycle.toString());
//
//        bicycle.applyBreak();
//        bicycle.applyBreak();
//
//        System.out.println(bicycle.toString());

//        MountainBike mountainBike = new MountainBike(0,0,0,4);
//
//        // java.lang.System
//        System.out.println(mountainBike.toString());
//
//        mountainBike.setSeatHeight(6);
//        mountainBike.setSeatHeight();
//        mountainBike.setCadence(20);
//        mountainBike.setGear(3);
//        mountainBike.speedUp(25);
//
//        System.out.println(mountainBike.toString());
//
//        mountainBike.applyBreak();
//
//        System.out.println(mountainBike.toString());

        MathTest mathTest = new MathTest();
        int x = mathTest.add(3,4);
        int y = mathTest.add(5,6,7);
        int z = mathTest.add(1,2,3,4);

        System.out.println("x: "+x+", y: "+y+ ", z: "+z);



    }
}
