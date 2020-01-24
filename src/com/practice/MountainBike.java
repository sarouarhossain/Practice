package com.practice;

public class MountainBike extends Bicycle{
    // cadence, gear, speed
    // setCadence, setGear, speedUp, apply break, toString

    public int seatHeight;

    public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight){
        super(startCadence,startGear,startSpeed);
        System.out.println("I came to Mountainbike constructor");
        this.seatHeight = seatHeight;
    }

    // public String toString()
    @Override
    public String toString() {
        return super.toString() + "\nseatHeight: "+this.seatHeight;
    }

    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
}
