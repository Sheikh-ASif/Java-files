package com.AsifjavaTutorial;

abstract class Car {
    public abstract void sound();
    public void horn(){
        System.out.println("beep beep");
    }
}
class RangeRover extends Car{
    public void sound(){
        System.out.println("Tagda wala beep beep");
    }

}
class  Vechicle {
    public static void main(String[] args) {
        RangeRover Range = new RangeRover();
        Range.horn();
        Range.sound();
    }
}