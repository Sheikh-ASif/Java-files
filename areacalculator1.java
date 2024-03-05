package com.AsifjavaTutorial;

public class areacalculator1{
    int height ;
    int base;
    int hypo;
    areacalculator1(){
        this.height = 3;
        this.base = 4;
        this.hypo = 5;
    }

    public static void main(String[] args) {
        areacalculator1 area1 = new areacalculator1();
        System.out.println("the height of triangle is:3");
        System.out.println("the base of triangle is:4");
        System.out.println("the hypo of triangle is:5");
        System.out.println("The area of triangle is:" +area1.area(area1.base,area1.height));
        System.out.println("the perimeter of triangle is:" + area1.perimeter(area1.base, area1.height, area1.hypo));
    }
    public int area(int base, int height){
        return (base*height)/2;
    }
    public int perimeter(int height,int base,int hypo){
        return (height+base+hypo);
    }
}
