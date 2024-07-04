package com.cbfacademy.shapes;

public class Paint {
    protected double coverage;
   public Paint(double coverage){
    this.coverage=coverage;
   }
   //Method to calculate the amount of paint needed
   
   public double getAmount(Shape shape){
    double area =shape.getArea();
    return area/coverage;
   }
    
}
