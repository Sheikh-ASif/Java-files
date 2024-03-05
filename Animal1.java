package com.AsifjavaTutorial;

public class Animal1 {
     void eat(){

     }
         //System.out.println("Animal is eating");
     }
//}
class Dog extends Animal1 {
    void eat(){
        System.out.println("The dog is eating");
        }
        }
        class Inheritance{
            public static void main(String[] args) {
                Dog D = new Dog();
                D.eat();

            }
        }