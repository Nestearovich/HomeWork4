package com.example.lib;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MyClass {


    public static void main(String[] args){
        Baby baby = new Baby("Jon",13,164);
        Adult adult1 = new Adult("Alex" ,23,181);
        Adult adult2 = new Adult("Elena" ,22,171);
        Adult adult3 = new Adult("Marry" ,22,168);
        Adult adult4 = new Adult("Tod" ,24,184);

        Up<Baby,Adult> converter = x -> new Adult("Jon ",22,183);
        Adult adult = converter.growingUp(baby);

        System.out.println(adult.getStr()+" Name " + adult.getName()+ " Age " + adult.getAge()+ " Height " + adult.getHeight());

        ArrayList<Adult> list = new ArrayList<>();
        list.add(new Adult("Alex" ,23,181));
        list.add(new Adult("Elena" ,22,171));
        list.add(new Adult("Marry" ,22,168));
        list.add(new Adult("Tod" ,24,184));
//стримы позже доделаю,бдуду разбираться
        Stream stream = list.stream();
        stream.filter(x -> x.toString().length() ==3).forEach(System.out::println);
        list.stream().forEach(x -> System.out.println(x.toString()));


    }
}



@FunctionalInterface
interface Up<T,N>{
    N growingUp (T t);
}