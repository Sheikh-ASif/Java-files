package com.AsifjavaTutorial;

import java.sql.SQLOutput;
import java.util.Scanner;

//public class Addition {

  //  public static void main(String[] args) {
    //    int a;
      //  int b;
      //  int c;
   //     Scanner Sc = new Scanner(System.in);
     //   Addition obj =new Addition();
       // System.out.println("Enter the value of a");
      //  a = Sc.nextInt();
     //   System.out.println("Enter the value of b");
        //b = Sc.nextInt();
//        System.out.println("Enter the value of c");
  //      c = Sc.nextInt();
    //    System.out.println("the sum of three number is " +obj.sum(a,b,c));
//    }
  //  public int sum(int a,int b,int c){
    //    return (a+b+c);
//    }
//}
  public class Addition{
      public static void main(String[] args){
          int a;
          int b;
          int c;

          Scanner sc = new Scanner(System.in);
          Addition Add = new Addition();

          System.out.println("Enter the value of a");
          a = sc.nextInt();

          System.out.println("Enter the value of b");
          b = sc.nextInt();

          System.out.println("Enter the value of c");
          c = sc.nextInt();

          System.out.println("the sum of three numbers is :" + Add.sum(a,b,c));
      }
      public int sum(int a,int b,int c){
          return(a+b+c);
      }
  }