package com.company;

public class Rhombus extends Shape{
  private int length;

  public Rhombus() {
  }
  public Rhombus(int length1, int length2, int length3, int length) {
    super(length1, length2, length3);
    this.length = length;
  }

  @Override
  public double getPerimeter() {

    double perimeter = length+getLength1()+getLength2()+getLength3();
    return perimeter;
  }

  @Override
  public String toString() {
    return super.toString()+"length "+length+"}";
  }
}
