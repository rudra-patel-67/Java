package com.shapes;

public class Square{
    private double length;

    public Square(double length){
        this.length = length;
    }
    public double getPerimeter(){
        return 4*length;
    }
    public double getArea(){
        return length*length;
    }
}
