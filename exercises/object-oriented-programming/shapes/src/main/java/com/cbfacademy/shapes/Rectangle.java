package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    protected double lenghth;
    protected double width;


    Rectangle(double lenghth, double width) {
        this.lenghth = lenghth;
        this.width = width;
        this.name = "Rectangle";

    }

    @Override
    public double getArea() {
        return this.lenghth * this.width;
    }

    
}
