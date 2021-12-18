package com.company.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Account {
    static List<Account> accountsCreated = new ArrayList<>();
    public  List<Card> cardsCreated;
    Card card;
    Random random = new Random();
  //  String accountIdentifer;

    public Account(){
       // this.accountIdentifer = String.format("%09d", random.nextInt(100000000));
        this.cardsCreated = new ArrayList<>();
        this.cardsCreated.add(new Card());
        //this.cardsCreated.get(lastCard()).setAccountIdentifer(accountIdentifer);
        lastCardNumber();
        lastCardPin();

    }


    public Card getCard() {

        return card;
    }

    public static int lastAccount() {

        return accountsCreated.size() - 1;
    }
    public String lastCardPin(){

        return this.cardsCreated.get(lastCard()).getPin();
    }
    public String lastCardNumber(){

        return this.cardsCreated.get(lastCard()).getCardNumber();
    }
    public int lastCard() {
        return cardsCreated.size() - 1;
    }





public static void run() {
    Scanner scan = new Scanner(System.in);
    int pickOption;

    do {
        Info.startInf();
        pickOption = scan.nextInt();
        switch (pickOption) {
            case 1:
                accountsCreated.add(new Account());
                System.out.println("Your card has been created\n" +
                        "Your card number:\n" +
                        accountsCreated.get(lastAccount()).lastCardNumber() + "\n" +
                        "Your card PIN:\n" +
                        accountsCreated.get(lastAccount()).lastCardPin() + "\n");
                break;
            case 2:
                System.out.println("Enter your card number: ");
                scan.nextLine();
                String checkingCardNum = scan.nextLine();
                System.out.println("Enter your PIN: ");
                String checkingCardPin = scan.nextLine();
                for (Account acc : accountsCreated){
                    for (Card e : acc.cardsCreated){
                        if (e.cardNumber.equals(checkingCardNum) && e.pin.equals(checkingCardPin)) {
                            for (; ; ) {
                                System.out.println("You have successfully logged in!\n");
                                Card.loginInf();
                                pickOption = scan.nextInt();
                                if (pickOption == 1) {
                                    System.out.println("Balance: " + e.getBalance());
                                } else if (pickOption == 2) {
                                    System.out.println("You have successfully logged out!");
                                    break;
                                } else if (pickOption == 0) {
                                    System.out.println("Bye!");
                                    break;
                                }
                            }
                            break;
                        } else {
                            System.out.println("Wrong card number or PIN!");
                            break;
                        }
                    }
                }

            case 0:
                System.out.println("Bye!");
                break;
            default: {
                System.out.println("default");
                break;
            }
        }


    } while (pickOption != 0);

}



}
