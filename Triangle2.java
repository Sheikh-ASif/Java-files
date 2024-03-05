package com.AsifjavaTutorial;

import java.util.*;

public class Triangle2{
    int height;
    int base;
    int hypo;
    Triangle2(){   //constructor
        height = 3;
        base = 4;
        hypo  = 4;
    }

   public static void main(String[] args) {
       Triangle2 tri = new Triangle2();
       System.out.println("The height is" +tri.height);
       System.out.println("the base is" +tri.base);
       System.out.println("the hypo is"+tri.hypo);
       System.out.println("The area of triangle is:"+tri.area(tri.base,tri.height));
       System.out.println("the perimetr of triangle is:"+tri.perimetr(tri.height,tri.base,tri.hypo));
   }
    public int perimetr(int height,int base,int hypoteneous ) {
        return base + height + hypoteneous;
    }
    public int area(int base, int height){
    return (base*height)/2;
    }
}


