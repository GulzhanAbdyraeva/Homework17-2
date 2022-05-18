package com.company;

public abstract class Shape {
    private int length1;
    private int length2;
    private int length3;

    public Shape() {
    }

    public Shape(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getLength3() {
        return length3;
    }

    public void setLength3(int length3) {
        this.length3 = length3;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape {" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                '}';
    }
}
