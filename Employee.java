package com.AsifjavaTutorial;

import java.util.Scanner;
 public class Employee{
   String name;
     int Salary;
     int Year_of_joining;
     String address;

     public static void main(String[] args) {
         Scanner Sc = new Scanner(System.in);
         Employee emp = new Employee();
         for (int i = 0; i < 3; i++) {
             System.out.println("Enter the detail of Employee:" + (i + 1));
             System.out.println("Enter the name of Employee");
             emp.name = Sc.nextLine();
             System.out.println("Salary of the Employee");
             emp.Salary = Sc.nextInt();
             System.out.println("Year_of_joining");
             emp.Year_of_joining = Sc.nextInt();
            // System.out.println("");
             Sc.nextLine();
             System.out.println("address");
             emp.address = Sc.nextLine();
         }
     }
     }
