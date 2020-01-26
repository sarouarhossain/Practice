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

    public void setSeatHeight(){

    }

    public void setSeatHeight(int x,int y){

    }

    public void setSeatHeight(int x,String y){

    }

    // method overloading e parameters judge hobe, return judge hobe na
    public int setSeatHeight(int x, float y){
        return 0;
    }
}
