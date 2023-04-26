package org.example.mallon;

import java.time.LocalDate;

public class PremierAccount extends CurrentAccount{
    private double cashback;
    public PremierAccount() {
    }

    public PremierAccount(double rate_of_interest, double fees, boolean overdraft_facility,
                          LocalDate date_of_opening, double accountBalance, DebitCard debitCard, double cashback) {
        super(rate_of_interest, fees, overdraft_facility, date_of_opening, accountBalance, debitCard);
        this.cashback = cashback;
    }

    @Override
    public String toString() {
        return "PremierAccount{}";
    }
}
