package org.example.mallon;

import java.time.LocalDate;

public abstract class Account {
    private double rate_of_interest;
    private double fees;
    private boolean overdraft_facility;

    private LocalDate date_of_opening;

    private double accountBalance;

    public Account() {
    }

    public Account(double rate_of_interest, double fees, boolean overdraft_facility, LocalDate date_of_opening, double accountBalance) {
        this.rate_of_interest = rate_of_interest;
        this.fees = fees;
        this.overdraft_facility = overdraft_facility;
        this.date_of_opening = date_of_opening;
        this.accountBalance = accountBalance;
    }

    public LocalDate getDate_of_opening() {
        return date_of_opening;
    }

    public void setDate_of_opening(LocalDate date_of_opening) {
        this.date_of_opening = date_of_opening;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getRate_of_interest() {
        return rate_of_interest;
    }

    public double getFees() {
        return fees;
    }

    public boolean isOverdraft_facility() {
        return overdraft_facility;
    }

    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setOverdraft_facility(boolean overdraft_facility) {
        this.overdraft_facility = overdraft_facility;
    }
}
