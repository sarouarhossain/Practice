package com.practice;

public class Bicycle {
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    // function overloading -> constructor overloading
    public Bicycle(){
        this.cadence = 0;
        this.gear = 0;
        this.speed = 0;
    }

    public Bicycle(int startCadence, int startGear, int startSpeed) {
        System.out.println("I came to Bicycle class");
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setCadence(int newCadenceValue){
        cadence = newCadenceValue;
    }

    public void setGear(int newGearValue){
        this.gear = newGearValue;
    }

    public void speedUp(int increament){this.speed = increament;}

    public void applyBreak(){this.speed--;}

    public String toString(){
        String result = "object situation: \nCadence: "+this.cadence + "\nGear: "+this.gear + "\nSpeed: "+this.speed;
        return result;
    }
}
