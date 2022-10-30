package com.example.lib2;

public class MyClass {
    public static void main(String[] args){
        ThreadClass thread1 = new ThreadClass();
        ThreadClass thread2 = new ThreadClass();
        thread1.start();
        long start = System.currentTimeMillis();
        System.out.println("call first thread " + Thread.currentThread().getName()+ " " + start);

    }
}

class ThreadClass extends Thread{
    public void run(){
        try {
            sleep(5000);
            long start = System.currentTimeMillis();
            Thread thread2 = Thread.currentThread();
            System.out.println("I'm run this cade in:" + thread2.getName() + " " + start);
        } catch (Exception e) {
            System.out.println("noy");
        }
    }
}