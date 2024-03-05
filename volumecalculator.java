package com.AsifjavaTutorial;

import java.util.*;

public class volumecalculator {
    int l, b, h, side;
    double radius;

    public int volume(int side) {

        return side * side * side;
    }

    public int volume(int l,int b,int h) {
        return l * b * h;
    }
    public double volume(double radius){
        return (4*Math.PI*radius*radius*radius)/3;
    }

    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        volumecalculator obj= new volumecalculator();
        System.out.println("Enter the  side of cube");
        obj.side= Sc.nextInt();
        System.out.println("The volume of cube is " +obj.volume(obj.side));

        System.out.println("Enter the length,breath,height of cuboid");
        System.out.print("the length is");
        obj.l= Sc.nextInt();
        System.out.print("the breadth is");
        obj.b= Sc.nextInt();
        System.out.print("the height is");
        obj.h= Sc.nextInt();
        System.out.println("the volume of cuboid is " +obj.volume(obj.l,obj.b,obj.h));

        System.out.println("Enter the volume of sphere:");
        obj.radius= Sc.nextInt();
        System.out.println("the volume of sphere is " +obj.volume(obj.radius));

    }
}


