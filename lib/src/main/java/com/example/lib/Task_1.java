package com.example.lib;

public class Task_1 {
    public static void main(String[] args) {
        int[][] mass = new int[][]{{2, 3, 4}, {6, 7, 8}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
