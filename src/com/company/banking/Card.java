package com.company.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Card {
   public static List<Card> allCardsCreated = new ArrayList<>();
    String BIN;
    String accountIdentifer;
    String checsum;
    String cardNumber;
    String pin;
    int balance;

    public Card(){
        this.BIN = "400000";
        this.accountIdentifer = String.format("%09d", random.nextInt(100000000));
        this.checsum = luhnAlgorithm();
        this.cardNumber = this.BIN + this.accountIdentifer + this.checsum;
        this.pin = String.format("%04d", random.nextInt(10000));;
        this.balance = 0;

    }

    Random random = new Random();

//    public String getRandomPin(){
//        String newPin = "wrongAccountPin";
//        String id = String.format("%04d", random.nextInt(10000));
//        for(Card e : cardsCreated){
//            if(e.pin.equals(id)){
//                return getRandomAccID();
//            } else {
//                newPin = id;
//            }
//
//        }
//        return newPin;
//    }

    public String getRandomAccID(){
        String newId = "wrongAccountID";
        String id = String.format("%09d", random.nextInt(100000000));
        for(Card e : allCardsCreated){
            if(e.accountIdentifer.equals(id)){
               return getRandomAccID();
            } else {
                 newId = id;
            }

        }
        return newId;
    }

    public String luhnAlgorithm(){
        int sum = 0;
        int whatChecksum = 0;
        String all = this.BIN + this.accountIdentifer;
        int ArrLength = all.length();
        String [] arrString = all.split("");

        int [] arrInt = new int [ArrLength];
        for (int i = 0; i < ArrLength; i++) {
            arrInt[i] = Integer.parseInt(arrString[i]);
            if((i + 1) % 2 != 0) {
                arrInt[i] *= 2;
            }
            if(arrInt[i] > 9 ){
                arrInt[i] -= 9;

            }
            sum += arrInt[i];
        }
        for(;;){
            if((sum + whatChecksum)  % 10 != 0){
                whatChecksum ++;
            } else {
                break;
            }
        }
        return String.valueOf(whatChecksum);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getBIN() {
        return BIN;
    }

    public void setBIN(String BIN) {
        this.BIN = BIN;
    }

    public String getAccountIdentifer() {
        return accountIdentifer;
    }

    public void setAccountIdentifer(String accountIdentifer) {
        this.accountIdentifer = accountIdentifer;
    }

    public String getChecsum() {
        return checsum;
    }

    public void setChecsum(String checsum) {
        this.checsum = checsum;
    }

    public static void startInf(){
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
    }

    public static void loginInf(){
        System.out.println("1. Balance\n" +
                "2. Log out\n" +
                "0. Exit\n");
    }

}
