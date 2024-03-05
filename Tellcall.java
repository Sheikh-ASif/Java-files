package com.AsifjavaTutorial;

import java.util.Scanner;

//constructor program
//a class tellcall calculate the monthly phone bill of a consumer.some of the member are given below
public class Tellcall {
    String name;
    String phno;
    int n;
    double amt;    //amount
    Tellcall(String x,String y, int k ){       //parametrized constructor in which parmaetr contains
        name=x;
        phno=y;
        n=k;
        amt=0.0;
    }
    public void calculate(){
        if(n>0 && n<=100){
            amt = 500.0;
        }
        else if(n>100 && n<=200){
            amt = 1.0*n+500;
        }
        else if(n>200 && n<=300){
            amt = 1.20*n+500;
        }
        else if(n>100){
            amt = (double)(1.5*n+500);
        }
        else {
            amt = 0;
        }
    }
    void display(){
        System.out.println("Phone Number \t\t.Total.Calls.\t\t.Amount");
        System.out.println(phno+"\t\t"+name+"\t\t"+n+"\t\t"+amt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Tellcall tell = new Tellcall(nn,ph,c);
        System.out.println("Enter your name");
        String nn = sc.nextLine();
        System.out.println("Enter your Phone Number:");
        String ph = sc.nextLine();
        System.out.println("Enter the number of calls:");
        int c = sc.nextInt();
        Tellcall tell = new Tellcall(nn, ph, c);
        tell.calculate();
        tell.display();
    }
}
