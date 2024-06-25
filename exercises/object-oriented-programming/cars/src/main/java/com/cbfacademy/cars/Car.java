package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public String getDetails(){
        return "Car Details" + this.make + this.model + this.colour + this.year;
    }
}
