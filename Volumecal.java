package com.AsifjavaTutorial;

import java.util.Scanner;

public class Volumecal {
    int side;
    int l,b,h;
    //public int volume(int side){
      //  return side*side;
    //}
    //public int volume(int l, int b,int h){
      //  return l*b*h;
    //}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volumecal vol = new Volumecal();
        System.out.println("Enter the side of square");
        vol.side = sc.nextInt();
        System.out.println("The volume of square is:"+vol.volume(vol.side));
        System.out.println("The lenght is");
        vol.l = sc.nextInt();
        System.out.println("The bradth is");
        vol.b = sc.nextInt();
        System.out.println("The height is");
        vol.h = sc.nextInt();
        System.out.println("The volume of cuboid is:"+vol.volume(vol.l,vol.b,vol.h));
    }
    public int volume(int side){
        return side*side;
        }
        public int volume(int l, int b,int h){
         return l*b*h;
        }
}
