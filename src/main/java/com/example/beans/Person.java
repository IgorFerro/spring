package com.example.beans;

public class Person {

    public Person(){
       System.out.println("Person bean created by Spring");
    }

    private String name;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
