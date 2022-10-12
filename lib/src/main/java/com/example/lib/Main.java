package com.example.lib;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Car one = new Car("Audi", 240,15000);
        Car two = new Car("Bmw",320,16000);

        try {
            one.startCar();
        } catch (Exception e) {
        }
        System.out.println("car " + one.getBrand() + " start");
        System.out.println("car " + two.getBrand() + " start");
    }
    public static class Car {
        private String brand;
        private int speed;
        private int price;



        public Car(String brand, int speed, int price) {
            this.brand = brand;
            this.speed = speed;
            this.price = price;
        }

        public  String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public static void startCar() throws Exception {
            Random random = new Random();
            int randomValue = random.nextInt(20);
            boolean isEven = randomValue % 2 == 0;

            if (isEven) {
                System.out.println("Success");
            } else {
                throw new Exception("Failed");
            }
        }


    }
}
