package com.AsifjavaTutorial;

import java.util.Scanner;

class areacalculator {
    int l, b, side;
    double radius;

    public int area(int side) {

        return side * side;
    }

    public int area(int l, int b) {

        return l * b;
    }

    public double area(double radius) {
        return radius * Math.PI * radius;
    }




    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        areacalculator obj=new areacalculator();
        System.out.println("Enter the side of square");
        obj.side=Sc.nextInt();
        System.out.println("the area of square is:"+obj.area(obj.side));
        System.out.print("the length is ");
        obj.l=Sc.nextInt();
        System.out.print("the breadth is");
        obj.b=Sc.nextInt();
        System.out.println("the area of rectangle is"+obj.area(obj.l,obj.b));
        System.out.println("Enter the radius of circle:");
        obj.radius=Sc.nextDouble();
        System.out.println("the area of cicle is:"+obj.area(obj.radius));


    }
}
