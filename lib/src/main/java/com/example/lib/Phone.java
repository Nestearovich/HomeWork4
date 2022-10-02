package com.example.lib;

public class Phone {
    String number;
    String model;
    int weight;

    void receiveCall(String  name){
        System.out.println("Call " + name);
    }

    void receiveCall(String name, String number){
        System.out.println("Call " + name + "," + " number " + number);
    }

    void getNumber(){
        System.out.println(number + "\n");
    }

    void sendMessage(String number){
        System.out.println("Massage sent " + number);
    }


    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public static void main(String[] args) {
        Phone phone1 = new Phone("375(29)981-11-12","iPhone",140);
        System.out.println("Phone number: " + phone1.number);
        System.out.println("Phone model: " + phone1.model);
        System.out.println("Phone weight: " + phone1.weight + "\n");

        Phone phone2 = new Phone("375(33)542-17-23", "Xiaomi",120);
        System.out.println("Phone number: " + phone2.number);
        System.out.println("Phone model: " + phone2.model);
        System.out.println("Phone weight: " + phone2.weight + "\n");

        Phone phone3 = new Phone("375(25)123-12-41", "Honor", 100);
        System.out.println("Phone number: " + phone3.number);
        System.out.println("Phone model: " + phone3.model);
        System.out.println("Phone weight: " + phone3.weight + "\n");

        phone1.receiveCall("Vitali");
        phone1.getNumber();
        phone2.receiveCall("Alex");
        phone2.getNumber();
        phone3.receiveCall("Max");
        phone3.getNumber();

        phone1.receiveCall("Someone", "375(25)444-32-32\n");

        phone1.sendMessage(phone1.number);
        phone2.sendMessage(phone2.number);
        phone3.sendMessage(phone3.number);
    }
}


