package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rhombus = new Rhombus(5, 4, 5, 4);
        System.out.println(rhombus);
        System.out.println("Perimeter of rhombus is " +rhombus.getPerimeter());
        Shape triangle = new Triangle(23,20,20);
        System.out.println("\n"+triangle);
        System.out.println("Perimeter of triangle is " +triangle.getPerimeter());
        Shape rectangle = new Rectangle(23,23,12,12);
        System.out.println("\n"+rectangle);
        System.out.println("Perimeter of rectangle is " +rectangle.getPerimeter());
        Shape parallelogram = new Parallelogram(45,34,45,34);
        System.out.println("\n"+parallelogram);
        System.out.println("Perimeter of parallelogram "+parallelogram.getPerimeter());
        Shape square= new Square(23,34,45,32);
        System.out.println("\n"+square);
        System.out.println("Perimeter of square "+square.getPerimeter());

    }
}
