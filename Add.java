package com.AsifjavaTutorial;

import java.util.Scanner;

public class Add {
    int a;
    int b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        a=sc.nextInt();
        System.out.println("Enter the second variable");
        b=sc.nextInt();
    }
    void addition(Add a1,Add a2){
        a=a1.a+a2.a;
        b=a1.b+a2.b;
        System.out.println("The sum of intance variable is:"+a);
        System.out.println("The of intance variable is:"+b);
    }

    public static void main(String[] args) {
        Add a3 = new Add();
        Add a4 = new Add();
        Add a5 = new Add();
        a3.input();
        a4.input();
        a5.addition(a3,a4);

    }

    }
