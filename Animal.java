package com.AsifjavaTutorial;
//abstract class
public abstract class Animal {
    public abstract void Sound(); //abstract method(does not have a body
    public void sleep(){
        System.out.println("Zzz , khrate");   //regular method with body of the method
    }
}
class Cat extends Animal{  //sub class (inherit from the animal)
    @Override
    public void Sound() {
        System.out.println("The cat says: meow meow");
    }
}
class Main{
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.Sound();   //calling the animal sound by using object of the cat
        mycat.sleep();
    }
}