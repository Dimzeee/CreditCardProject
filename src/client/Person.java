package client;

import payment.CreditCard;
import java.util.ArrayList;

public class Person {
    //---------------------------------------------------------------------------
    // Instance Variable
    //---------------------------------------------------------------------------
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String suiteAddress;
    private String cityAddress;
    private String stateAddress;
    ArrayList creditCards;
    //---------------------------------------------------------------------------
    // Constructor
    //---------------------------------------------------------------------------
    public Person(String firstName,
                  String lastName,
                  String streetAddress,
                  String suiteAddress,
                  String cityAddress,
                  String stateAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.suiteAddress = suiteAddress;
        this.stateAddress = stateAddress;
        creditCards = new ArrayList<>();
    }//end constructor

    //---------------------------------------------------------------------------
    // Setter and Getters
    //---------------------------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getSuiteAddress() {
        return suiteAddress;
    }
    public void setSuiteAddress(String suiteAddress) {
        this.suiteAddress = suiteAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getStateAddress() {
        return stateAddress;
    }

    public void setStateAddress(String stateAddress) {
        this.stateAddress = stateAddress;
    }

    public ArrayList getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList creditCards) {
        this.creditCards = creditCards;
    }
    public void displayInfo(){
        System.out.println("");
        System.out.println("============================================================================");
        System.out.println("Display Information" );
        System.out.println("============================================================================");
        System.out.printf("%-20s %s %s \n","Name:", firstName, lastName);
        System.out.printf("%-20s %-20s \n", "Address", streetAddress);
        System.out.printf("%-20s %-20s \n", "Suite:", suiteAddress);
        System.out.printf("%-20s %-20s \n", "City:", cityAddress);
        System.out.printf("%-20s %-20s \n", "State:", stateAddress);

        System.out.println("------------------");
        System.out.println("Credit Card Info");
        System.out.println("------------------");
        for(int i=0; i<creditCards.size();i++){
            String cardName = ((CreditCard)creditCards.get(i)).getType();
            double creditLimit =((CreditCard)creditCards.get(i)).getCreditLimit();
            double currentBalance = ((CreditCard) creditCards.get(i)).getCurrentBalance();
            System.out.printf("%-20s %-20s \n", "CreditCard:", cardName);
            System.out.printf("%-20s %-20.2f \n", "Credit Limit:", creditLimit);
            System.out.printf("%-20s %-20.2f \n", "Current Balance:", currentBalance);
            System.out.println("");
        }//for loop
    }
//----------------------------------------------------
}//end class

