package com.example.lib;

import java.util.Arrays;

//4 задание
public class NextWork {
    public static void main(String[] args) {
        int mas[] = new int[20];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
    }
}
//5 задание
class NextWork2{
    public static void main(String[] args) {
        int mas[] = new int[12];
        int max = 0;
        int a = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 15);
            System.out.print(mas[i] + " ");
        }
        for(int i = 0; i < mas.length;i++) {
            if (mas[i]>=max) {
                max = mas[i];
                a = i;
            }
        }
        System.out.println("maxvalue " + mas[a]);
        System.out.println("index " + a);
    }
}
class Sort{
    //задание 7
    public static void main(String[] args) {
        int massive[] = {21,71,55,20,29,5,7,10,19,18,23,70};
        for (int i=1;i<massive.length-1;i++){
            int current = massive[i];
            int newValue = i -1;
            while (newValue >=0 && current < massive[newValue]){
                massive[newValue+1] = massive[newValue];
                newValue--;
            }
            massive[newValue+1] = current;
            System.out.println(Arrays.toString(massive));
        }
    }
}
class Sort2 {
    // задание 6
    public static void main(String[] args) {
        int massive[] = {88,39,22,44,65,1,12,54,67,20,2,9,39};
        boolean isSorted = false;
        int buffer;
        System.out.println(Arrays.toString(massive));
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;

                    buffer = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = buffer;
                }
            }
            System.out.println(Arrays.toString(massive));
        }
    }
}


