package com.cbfacademy.shapes;

public class Shapes {
    public static void main(String[] args) {
        Enclosure circle = new Circle(15);
        Enclosure square = new Square(20);

        System.out.println(square.computeArea(4));
        System.out.println(square.computePerimeter(4));

        System.out.println(circle.computeArea(0));
        System.out.println(circle.computePerimeter(0));


       
    }

    
}
