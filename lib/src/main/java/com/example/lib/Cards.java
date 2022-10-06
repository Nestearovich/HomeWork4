package com.example.lib;

public class Cards {
    public static void main(String[] args) {
        Cards cards1 = new Cards(4000,"5515 4321 3313 2311");
        cards1.addMoney(1000);
        Cards cards2 = new Cards(5000,"5515 4211 3114 1890");
        cards2.addMoney(2000);
        Cards cards3 = new Cards(6000," 5513 5552 7134 1423");
        cards3.withdraw(4000);
        cards1.ifo();
        cards2.ifo();
        cards3.ifo();
        System.out.println();
    }
       private int balance;
        public String numAcc;
        Cards (int balance, String numAcc){
            this.balance = balance;
            this.numAcc = numAcc;
        }


        public void addMoney ( int income){
            this.balance = this.balance + income;
            System.out.println(balance + " account replenished ");
        }

        public void withdraw ( int price){
            this.balance = this.balance - price;
            System.out.println( balance + " money withdrawn");
        }
        void ifo() {
            System.out.println(" current card information " + balance);
        }
}

