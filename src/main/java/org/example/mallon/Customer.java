package org.example.mallon;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Account> accounts;
    private ArrayList<CreditCard> creditCards;


    public Customer() {
    }

    public Customer(ArrayList<Account> accounts, ArrayList<CreditCard> creditCards) {
        this.accounts = accounts;
        this.creditCards = creditCards;
    }

    public void addAccount (Account account) {
        accounts.add(account);
    }

    public void addCard (CreditCard card) {
        creditCards.add(card);
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accounts=" + accounts +
                ", creditCards=" + creditCards +
                '}';
    }
}
