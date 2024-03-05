package com.AsifjavaTutorial;

import java.util.Scanner;

public class Distance {
    int km;
    int mtr;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km value");
        km = sc.nextInt();
        System.out.println("Enter the mtr value");
        mtr = sc.nextInt();
    }
    void addition(Distance km1, Distance km2){
        km = km1.km+km2.km;
        mtr = km1.mtr+km2.mtr;
        System.out.println("The sum of kilometr is:"+km);
        System.out.println("The sum of meter is:"+mtr);
    }

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Distance km3 = new Distance();
        Distance km4 = new Distance();
        Distance km5 = new Distance();
        km3.input();
        km4.input();
        km5.addition(km3,km4);
    }
}
