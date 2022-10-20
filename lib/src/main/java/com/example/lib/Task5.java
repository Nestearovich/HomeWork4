package com.example.lib;

import java.util.Arrays;
//дом задание перезаписать все значения в один 1 мер массив и отсортировать
public class Task5 {
    public static void main(String[] args) {
        int[][] massive = {{12, 32, 21, 44, 18}, {13, 87, 44, 12, 55},{1,3,5,2,6}};

        for(int[] num1:massive){
            Arrays.sort(num1);
            for (int num:num1){
                System.out.print(num + " ");
            }
        }
        System.out.println();

        for(int[]num1:massive){
            for(int num=0;num<num1.length;num++){
                System.out.print(num1[num1.length-1]-num + " ");
            }
        }
    }
}
