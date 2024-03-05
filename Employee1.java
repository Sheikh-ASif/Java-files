package com.AsifjavaTutorial;
//Assignment question
public class Employee1 {
    String empname;
    double basicpay;
    Employee1(String empname,double basicpay){
        this.empname = empname;
        this.basicpay = basicpay;
    }
    public double salarycal(){
        double HRA = 0.3*basicpay;
        double DA = 0.4*basicpay;
        double Totalsalary = basicpay+HRA+DA;
        return Totalsalary;
    }

    public static void main(String[] args) {
        Employee1 emp = new Employee1("Asif",100000);
        double Totalsalary = emp.salarycal();
        System.out.println("Enter the name of employee:"+emp.empname);
        System.out.println("Enter the salary of employee:"+emp.basicpay);
        System.out.println("Enter the totalsalary of employee:"+ Totalsalary);
    }
}
