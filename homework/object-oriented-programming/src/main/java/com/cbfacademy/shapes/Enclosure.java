package com.cbfacademy.shapes;

public interface Enclosure {
    double perimeter();
    double area();

    default double computePerimeter(double sides) {
        return perimeter();
    }

    default double computeArea(double surface) {
        return area();
    }


    
}
