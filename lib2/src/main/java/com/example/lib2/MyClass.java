package com.example.lib2;

public class MyClass {



    public static void main(String[] args) {
        Season season = Season.WINTER;
        seas(Season.WINTER);
        print();

    }

    static void seas(Season season) {
            switch (season) {
                case WINTER:
                    System.out.println("I love winter ");
                    break;
                case SUMMER:
                    System.out.println("this warm ");
                    break;
                case SPRING:
                    System.out.println("flowers ");
                    break;
                case AUTUMN:
                    System.out.println("cold ");
                    break;

            }
        }
        public static void print() {
        for(Season a : Season.values()) {
            System.out.println(a + " " + a.temperatyr + " " + a.getDescription());
        }
        }
    }



enum Season {
    SUMMER(25){
        @Override
        public String getDescription() {
            return "Warm season";
        }
    }, AUTUMN(8), WINTER(-12), SPRING(15);



    int temperatyr;

    Season(int temperatyr){
        this.temperatyr = temperatyr;
    }

   public String getDescription(){
        return "Cold season";
    }
}