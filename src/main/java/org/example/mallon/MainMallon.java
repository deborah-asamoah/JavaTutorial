package org.example.mallon;

public class MainMallon {
    public static void main(String[] args) {
//        System.out.println("Hello world");

        Customer a = new Customer();

        Account basicAccount = new BasicAccount();

        a.addAccount(basicAccount);

        System.out.println(a);
    }
}
