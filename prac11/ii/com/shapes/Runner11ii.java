package com.shapes;
public class Runner11ii {
    public static void main(String[] args) {
        int r = 4;
        int len = 13;
        Circle circle = new Circle(r);
        System.out.println("Radius of Circle : "+r+" cm");;
        System.out.println("Circumference of Circle : "+circle.getCircumference()+" cm");;
        System.out.println("Area of Circle : "+circle.getArea()+" sq.cm");;
        
        Square sq = new Square(len);
        System.out.println("Length of side of Sqaure : "+len+" cm");
        System.out.println("Perimeter of Square : "+sq.getPerimeter()+" cm");;
        System.out.println("Area of Square : "+sq.getArea()+" sq.cm");;

    }
}
