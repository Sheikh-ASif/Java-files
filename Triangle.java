package com.AsifjavaTutorial;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        int base=3;
        int height=4;
        int hypoteneous = 5;
        //Scanner sc= new Scanner(System.in);
        Triangle tri = new Triangle();
        System.out.println("the base of triangle is 3:");
       // base = sc.nextInt();
        System.out.println("the height of triangle is 4");
       // height = sc.nextInt();
       // System.out.println("The area of triangle is: " +tri.area(height,base));
        System.out.println("the hypoteneous of triangle is 5");
        //int hypoteneos = sc.nextInt();
        System.out.println("The area of triangle is: " +tri.area(height,base));
        //int hypoteneos = sc.nextInt();
        System.out.printf("the parameter of triangle is: " +tri.parameter(height,base,hypoteneous));
    }
    public int area(int height, int base){
     return (base*height)/2;}
   public int parameter(int height,int base,int hypoteneous ){
        return base+height+hypoteneous;
   }
}
