package com.company;

//Inheritance in java

class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l,int h){
        System.out.println((1 / 2) * l * h);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area of triangle is : ");
        t.area(2,1);

        Circle c = new Circle();
        System.out.println("Area of circle is : ");
        c.area(5);
    }
}
