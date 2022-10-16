package com.example.lib;

import java.util.Arrays;
// 1 задание
public class MyClass {
    public static void main(String[] args){
        int mass [] = {2,4,6,8,10,12,14,16,18,20};
        String massToString = Arrays.toString(mass);
        System.out.println(massToString);
        for (int a = 0;a<10; a++){
            System.out.println(mass[a] + " ");
        }
    }
}
//2 задание
class Main{
    public static void main(String[] args) {
        int mas[] = new int[50];
        for(int i = 0,a=1; i< mas.length; a=a+2,i++){
            mas[i] = a;
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        for(int i = mas.length-1;i>=0;i--){
            System.out.print(mas[i] + " ");
        }
    }
    }
//3 задание
    class Main2{
    public static void main(String[] args){
        int mas [] = new int[15];
        int a;
        a = 0;
        for (int i = 0;i< mas.length;i++){
            mas[i]= (int)(Math.random()*99);}
        for (int i = 0; i< mas.length;i++){
            if(mas[i]%2==0){
                a++;
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println(a);
    }
    }
