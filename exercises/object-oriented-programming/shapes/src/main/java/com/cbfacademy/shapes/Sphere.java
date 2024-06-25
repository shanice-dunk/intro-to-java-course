package com.cbfacademy.shapes;

public class Sphere extends Shape {
    protected double radius;
    

    public Sphere(double radius) {
      this.radius = radius;
      this.name = "Sphere";
    }

    @Override
    public double getArea() {
        return (4 * Math.PI * (radius*radius));
    }



}
