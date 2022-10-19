package com.example.lib;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[][][] numbers = {
                {
                        {1, 2, 3,},
                        {4, 5, 6,7},
                        {8,9,10,11,12}
                }
        };
        for(int number2D = 0;number2D<numbers.length;number2D++){
            for(int numbers1D = 0;numbers1D<numbers[number2D].length;numbers1D++){
                for(int number = 0;number<numbers[number2D][numbers1D].length;number++){
                    System.out.print(numbers[number2D][numbers1D][number] + "\t");
                }
                System.out.println();
            }
        }
    }
}
