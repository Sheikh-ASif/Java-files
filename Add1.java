package com.AsifjavaTutorial;
//Adding two numbers by using constructor

public class Add1{
    int x;
    int y;
    int sum;
    Add1(){
        this.x = 20;
        this.y = 30;
        this.sum = x+y;
    }
    public void displayDetails(){
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("sum:"+sum);
    }

    public static void main(String[] args) {
        Add1 add = new Add1();
        add.displayDetails();
    }
}