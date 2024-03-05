package com.AsifjavaTutorial;

import java.util.*;
@SuppressWarnings("ALL")
public class Avg{
    float a;
     float b;
    float c;
    public float average(float a, float b, float c){
        return (a+b+c)/3;
    }


    public static void main(String[] args) {
        float a;
        float b;
        float c;

        Scanner sc = new Scanner(System.in);
        Avg obj = new Avg();
        System.out.println("Enter the value of a");
        //a = sc.nextFloat();
       a = sc.nextFloat();
        System.out.println("enter the value of b");
        b = sc.nextFloat();
        //obj.b = sc.nextFloat();
        System.out.println("Enter the value of c");
        c = sc.nextFloat();
       // obj.c = sc.nextFloat();
       // System.out.println("Thee average of three number is:" +obj.average(obj.a,obj.b,obj.c));
        System.out.println("Thee average of three number is:" +obj.average(a,b,c));
    }
   // public float average(float a, float b, float c){
  //      return (a+b+c)/3;
   //}
}
