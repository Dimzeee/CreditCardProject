package app;

import client.Person;
import java.util.Random;
import goods.Item;
import payment.CreditCard;

//==========================================
//PROGRAMMER: Edima Nyong
//PANTHER ID: 6422984
//CLASS: COP2210
//SECTION: U02
//SEMESTER: Fall 2023
//CLASSTIME: T/TH 9:30-12:15 am
//Lab: Project 2
//DUE: Nov 28 (11:59)
//CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my
//own and that none of it is the work of any other person.
//==========================================
public class Controller {
    public static void main(String args[]) throws InterruptedException{

        Person john = new Person("John", "Doe", "1100 Brickell Ave", "Apt 102","Maimi", "Florida");

        CreditCard masterCard = new CreditCard(john, "MasterCard", 2500.00);
        CreditCard ax = new CreditCard(john, "American Express", 5000.00);

        // adding the masterCard to john
        john.getCreditCards().add(masterCard);
        john.getCreditCards().add(ax);

        // creating an Item variable named cafeMocha
        Item cafeMocha = new Item("Food","Cafe Mocha",4.77);
        Item gucciSlipper = new Item("Clothing","Gucci Princetown", 2650.00);
        Item coke = new Item("Food","Coke",1.99);
        Item airlinesTicket = new Item("Travel","MIA-SFO",823.26);

        // john is buying cafeMocha using his MasterCard credit card
        ((CreditCard)john.getCreditCards().get(0)).makeCharge(cafeMocha);
        // john is buying gucciSlipper using his MasterCard credit card
        ((CreditCard)john.getCreditCards().get(0)).makeCharge(gucciSlipper);
        // john is buying gucciSlipper using his American Express credit card
        ((CreditCard)john.getCreditCards().get(1)).makeCharge(gucciSlipper);
        // john is running a transaction Report on his MasterCard
        ((CreditCard)john.getCreditCards().get(0)).transactionsReport();
        // john is running a transaction Report on his American Express
        ((CreditCard)john.getCreditCards().get(1)).transactionsReport();

        Random generator = new Random();
        // buying 7 cafe mocha using different credit cards
        for(int i = 1; i <= 7; i++){
            //sleep for a random time up to i seconds
            Thread.sleep(generator.nextInt(1001));
            if(i%3 != 0){//buy on american express
                ((CreditCard)john.getCreditCards().get(1)).makeCharge(cafeMocha);
            }else{// buy on mastercard
                ((CreditCard)john.getCreditCards().get(0)).makeCharge(cafeMocha);
            }
        }//end for

        // buying 5 airline tickets using different cards
        for(int i = 1; i <= 5; i++) {
            //sleep for a random time up to i seconds
            Thread.sleep(generator.nextInt(1001));
            if (i % 2 == 0) {//buy on mastercard
                ((CreditCard) john.getCreditCards().get(0)).makeCharge(airlinesTicket);
            } else {//buy on amercian express
                ((CreditCard) john.getCreditCards().get(1)).makeCharge(airlinesTicket);
            }
        }//end for
        // buying 10 cokes using different credit cards
        for(int i = 1; i <= 10; i++) {
            //sleep for a random time up to i seconds
            Thread.sleep(generator.nextInt(1001));
            // this is use to randomly select a credit card
            int randomSelectCard = generator.nextInt(2);
            if (randomSelectCard == 0) { //mastercard
                ((CreditCard) john.getCreditCards().get(0)).makeCharge(coke);
                System.out.println("randomSelectCard: MasterCard");
            } else {
                ((CreditCard) john.getCreditCards().get(1)).makeCharge(coke);
                System.out.println("randomSelectCard: AmericanExpress");
            }
        }//end for

        //john is running a transaction Report on his mastercard
        ((CreditCard)john.getCreditCards().get(0)).transactionsReport();
        //john is running a transaction Report on his american express
        ((CreditCard)john.getCreditCards().get(1)).transactionsReport();

        // john is running displayInfo method
        john.displayInfo();






    }//main
}//controller