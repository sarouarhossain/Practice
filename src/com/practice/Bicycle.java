package com.practice;

public class Bicycle {
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startGear, int startSpeed) {
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
}
