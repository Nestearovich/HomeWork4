package com.example.lib;

public class Cars implements IWeehes {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.wheelsSpinning();

    }

    @Override
    public void wheelsSpinning() {
        System.out.println("the wheels are spinning");
    }
    IWeehes go;
    Cars (IWeehes action){
        this.go = action;
    }
    public void go(){
        go.wheelsSpinning();
    }
}


interface IWeehes {
    void wheelsSpinning();
    }

