package com.practice.constructor_chain;

import java.util.Date;

public class Job {
    private String title;
    private double salary;
    private Date createdDate;

    public Job(){
        this.createdDate = new Date();
        this.salary = 10000;
        this.title = "title not set";
    }

    public Job(String title){
        this();
        this.title = title;
    }

    public Job(String title, double salary){
        this();
        this.title = title;
        if (salary >= 10000){
            this.salary = salary;
        }
    }

    public void show(){
      System.out.println("title: "+title+" salary: "+salary+" createdDate: "+createdDate);
    }
}
