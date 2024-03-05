package com.AsifjavaTutorial;

import java.util.Scanner;

public class Constructor {
    static String name;
    static String add;
  private static double salary;
    double salry;
    Constructor(){      ///non paramertrized constructor
       name = "Asif";
        add = "Lucknow";
        double salary =55000000;
    }
    public static void displayDetails() {
        System.out.println("Name:" + name);
       System.out.println("Address:" + add);
        System.out.println("Salary:" + salary);
   }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.displayDetails();

    }
}
