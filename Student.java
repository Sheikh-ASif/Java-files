package com.AsifjavaTutorial;

public class Student {
    String name;
    int roll_no;

    //Constructor to initialize the variables
 // public Student(String name, int roll_no) {
        //this.name = name;
       // student.roll_no = roll_no;}

    public static void main(String[] args) {
        // Creating an object of the Student class and assigning values
        Student student = new Student();
        student.name="john";
        student.roll_no=2;
        // Printing the values
        System.out.println("Name: " + student.name);
        System.out.println("Roll No: " + student.roll_no);
    }
}
