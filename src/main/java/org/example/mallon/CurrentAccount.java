package org.example.mallon;

import java.time.LocalDate;

public abstract class CurrentAccount extends Account{

    private DebitCard debitCard;

    public CurrentAccount() {
    }

    public CurrentAccount(double rate_of_interest, double fees, boolean overdraft_facility,
                          LocalDate date_of_opening, double accountBalance, DebitCard debitCard) {
        super(rate_of_interest, fees, overdraft_facility, date_of_opening, accountBalance);
        this.debitCard = debitCard;
    }
}
