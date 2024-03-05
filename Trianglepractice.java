package com.AsifjavaTutorial;

import java.util.Scanner;

public class Trianglepractice {
    int height;
    double base;
    float hypo;
    public double area(int height,double base){
          return (base*height)/2;
    }
    public double perimeter(int height,double base,float hypo){
        return (height+base+hypo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trianglepractice tri = new Trianglepractice();
        System.out.println("enter the height of triangle");
        tri.height = sc.nextInt();
        System.out.println("enter the base of triangle");
        tri.base = sc.nextDouble();
        System.out.println("enter the hypo of triangle:");
        tri.hypo = sc.nextFloat();
        System.out.println("the area of trianglee is:"+tri.area(tri.height,tri.base));
        System.out.println("the perimeter of triangle is:"+tri.perimeter(tri.height, tri.base, tri.hypo));
    }
}
