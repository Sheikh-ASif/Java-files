package com.AsifjavaTutorial;

import java.util.Scanner;

public class Calculator {
    int a,b;
    float A,B;
    double num1,num2;
    public int Calculate(int a,int b){
        return a+b;
    }
    public float Calculate(float A,float B){
        return A-B;
    }
    public double Calculate(double num1,double num2){
        return num1*num2;
    }
    public float Calculate(int a,float A){
   // public float (int a,float A){
        return a/A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("Enter the values of a and b");
        cal.a = sc.nextInt();
        cal.b = sc.nextInt();
        System.out.println("The sum of two integers values is:"+cal.Calculate(cal.a,cal.b));

        System.out.println("enter the values of A and B:");
        cal.A = sc.nextFloat();
        cal.B = sc.nextFloat();
        System.out.println("the subtraction of two float values is:"+cal.Calculate(cal.A,cal.b));
        System.out.println("Enter the values of num1 and num2");
        cal.num1 = sc.nextDouble();
        cal.num2 = sc.nextDouble();
        System.out.println("The multiplication of two double values is:" +cal.Calculate(cal.num1,cal.num2));

        System.out.println("Enter the values of a and A");
        cal.a = sc.nextInt();
        cal.A = sc.nextFloat();
        System.out.println("The division of one float and one integer values is:" +cal.Calculate(cal.a,cal.A));
    }
}
