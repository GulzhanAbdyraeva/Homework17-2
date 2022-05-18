package com.company;

public class Triangle extends Shape{
    public Triangle() {
    }

    public Triangle(int length1, int length2, int length3) {
        super(length1, length2, length3);
    }

    @Override
    public double getPerimeter() {
     double trianglePerimeter = getLength1()+getLength2()+getLength3();
        return trianglePerimeter;
    }
}
