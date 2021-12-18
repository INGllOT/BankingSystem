package com.company.banking;

public class Main {
    public static void main(String[] args) {



        Account.run();



//        Scanner scan = new Scanner(System.in);
//        List<Account> accountsCreated = new ArrayList<>();
//        int pickOption;
//
//        do {
//            Info.startInf();
//            pickOption = scan.nextInt();
//            switch (pickOption){
//                case 1:
//                    accountsCreated.add(new Account());
//                    System.out.println("Your card has been created\n" +
//                            "Your card number:\n" +
//                            accountsCreated.get(accountsCreated.size() - 1).cardsCreated.get(c) + "\n" +
//                            "Your card PIN:\n" +
//                            Card.cardsCreated.get(Card.cardsCreated.size() - 1).pin + "\n");
//                    break;
//                case 2:
//                    System.out.println("Enter your card number: ");
//                    scan.nextLine();
//                    String checkingCardNum = scan.nextLine();
//                    System.out.println("Enter your PIN: ");
//                    String checkingCardPin = scan.nextLine();
//                    for(Card e : Card.cardsCreated){
//                        if(e.cardNumber.equals(checkingCardNum) && e.pin.equals(checkingCardPin)){
//                            for(;;) {
//                                System.out.println("You have successfully logged in!\n");
//                                Card.loginInf();
//                                pickOption = scan.nextInt();
//                                if(pickOption == 1){
//                                    System.out.println("Balance: " + e.getBalance());
//                                }else if(pickOption == 2){
//                                    System.out.println("You have successfully logged out!");
//                                    break;
//                                }else if(pickOption == 0){
//                                    System.out.println("Bye!");
//                                    break;
//                                }
//                            }
//                            break;
//                        }  else  {
//                            System.out.println("Wrong card number or PIN!");
//                            break;
//                        }
//
//                    }
//                case 0:
//                    System.out.println("Bye!");
//                break;
//                default: {
//                    System.out.println("default");
//                    break;
//                }
//            }
//
//
//
//        } while (pickOption != 0);



    }
}