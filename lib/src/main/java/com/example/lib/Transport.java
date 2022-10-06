package com.example.lib;

public abstract class Transport {
    public static void main(String[] args){
        Track track = new Track();
        Car car = new Car();
        Tracktor tracktor = new Tracktor();
    }
    static void move(){


    }
    static void beep (){

    }

}
class Track extends Transport{

}
    class Car extends Transport implements Start{

        @Override
        public void on() {

        }
    }
    class Tracktor extends Transport implements Start{

        @Override
        public void on() {

        }
    }

    interface Start {
    void on();
    }