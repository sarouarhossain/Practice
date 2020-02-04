package com.practice.constructor_chain;

public class Child extends Parent{
    public String cName;

    public Child(String pName, String cName){
        super(pName);
        System.out.println("came here child constructor");
        this.cName = cName;
    }

    public void show(){
        System.out.println("Parent: "+pName+" Child: "+cName);
    }
}
