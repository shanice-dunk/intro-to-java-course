package com.cbfacademy.shapes;

public class Square implements Enclosure {
    double width;

    public Square(double width) {
       this.width = width;
    }

    @Override
    public double perimeter() {
        return width;
    }

    @Override
    public double area() {
        return width;
    }
    
}
