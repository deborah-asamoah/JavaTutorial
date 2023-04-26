package org.example.mallon;

import java.time.LocalDate;

public class BasicAccount extends CurrentAccount{
    public BasicAccount() {
    }

    public BasicAccount(double rate_of_interest, double fees, boolean overdraft_facility, LocalDate date_of_opening, double accountBalance, DebitCard debitCard) {
        super(rate_of_interest, fees, overdraft_facility, date_of_opening, accountBalance, debitCard);
    }

    @Override
    public String toString() {
        return "BasicAccount";
    }
}
