package com.example.lib2;

public class Main {
    public static void main(String[] args){
        ThreadClass3 threadClass3 = new ThreadClass3();
        threadClass3.start();

        ThreadClass4 threadClass4 = new ThreadClass4();
        Thread thread = new Thread(threadClass4);
        thread.start();


        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("The smarter a person is, the easier it is for him to recognize himself as a fool");
            }
        };
        thread1.start();

        //так же задание 3
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
              System.out.println("The one who does nothing is never wrong");
            }
        };
        Thread thread3 = new Thread(thread2);
        thread3.start();
    }
}

class ThreadClass3 extends Thread{
    public void  run(){
        System.out.println("My way of joking is to tell the truth.Nothing in the world is funnier");
    }
}

class  ThreadClass4 implements Runnable{
    public void run(){
        System.out.println("Success is a lousy teacher.He makes smart people think they can't lose");
    }

}
