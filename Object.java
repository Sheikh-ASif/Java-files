package com.AsifjavaTutorial;
import java.util.*;

public class Object{
        int a;
        int b;
public static void main(String[] args){
        Object ob1 = new Object();
        Object ob2 = new Object();
        Object ob3 = new Object();
        ob1.accept(20,20);
        ob2.accept(10,20);
        ob3.Addobj(ob1,ob2);
        ob3.show();
    }
    public void show() {
        System.out.println("Sum of the intanace variables:" + a);
        System.out.println("Sum of the intanace variables:" + b);
    }

    public void accept(int x,int y){
        a=x;
        b=y;
        }
public void Addobj(Object o1,Object o2){
        int a=30, b = 30;
        this.a = o1.a+o2.a;
        this.b = o1.b+o2.b;
        System.out.println("the sum of local variable(a+b)" +(a+b));
        }
        }
