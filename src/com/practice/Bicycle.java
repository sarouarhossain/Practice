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

    public void seedUp(int increament){this.speed = increament}

    public void applyBreak(){this.speed--;}

    public String toString(){
        String result = "Cadence: "+this.cadence + " Gear: "+this.gear + " Speed: "+this.speed;
        return result;
    }
}
