package com.example.lib;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[][] massive ={{12,32,21,44,18},{13,87,44,12,55}};
        for (int i = 0; i < massive.length; i++){
            Arrays.sort(massive[i]);
        }
        for (int massive1D = 0; massive1D < massive.length; massive1D++) {
            for (int element = 0; element < massive[massive1D].length; element++) {
                System.out.print(massive[massive1D][element] + "\t");
            }
            System.out.println();
        }
    }
}