package com.example.lib;

import static java.lang.Math.random;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[][][] mass = new int[2][2][4];
        for (int number2D = 0; number2D < mass.length; number2D++) {
            for (int numbers1D = 0; numbers1D < mass[number2D].length; numbers1D++) {
                for (int number = 0; number < mass[number2D][numbers1D].length; number++) {
                    mass[number2D][numbers1D][number] = (int) (random()*40);
                    System.out.print(mass[number2D][numbers1D][number] + "\t");
                }
                System.out.println();
            }
        }
    }
}
