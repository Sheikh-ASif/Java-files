package com.AsifjavaTutorial;

import java.util.Scanner;

public class Triangle1 {
    // public float parameter( float a, float b, float h) {

    //return (a + b + h);
    // }
    public static void main(String[] args) {
        float a; //hypotenus
        float b; //base
        float h; //height
        // parameter
        Scanner sc = new Scanner(System.in);
        Triangle1 tri = new Triangle1();
        System.out.println("Enter the a");
        a = sc.nextFloat();
        System.out.println("Enter the b");
        b = sc.nextFloat();
        System.out.println("Enter the h");
        h = sc.nextInt();
        System.out.println("The parameter of triangle1 is:" + tri.parameter(a, b, h));
    }

    public float parameter(float a, float b, float h) {

        return (a + b + h);
    }
}