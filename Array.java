package com.AsifjavaTutorial;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int size = Sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = Sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
            System.out.println("the largest number is:" + max);
            System.out.println("the ssmallesst number is:" + min);
        }
    }
}
