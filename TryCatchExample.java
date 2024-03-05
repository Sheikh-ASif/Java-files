package com.AsifjavaTutorial;

public class TryCatchExample {
    public static void main(String[] args){
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator/denominator;
            System.out.println("Result :"+result);
        }
        catch (ArithmeticException e){
            System.out.println("An arithmatic error occured :"+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("An exception occured: " + e.getMessage());
        }
        finally {
            System.out.println("Programmed blocked:");
        }
        System.out.println("The programm continued");
    }
    }
