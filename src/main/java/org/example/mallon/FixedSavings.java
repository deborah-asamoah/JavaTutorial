package org.example.mallon;

import java.time.LocalDate;

public class FixedSavings extends Account{
    public FixedSavings() {
    }

    public FixedSavings(double rate_of_interest, double fees, boolean overdraft_facility, LocalDate date_of_opening, double accountBalance) {
        super(rate_of_interest, fees, overdraft_facility, date_of_opening, accountBalance);
    }

    public boolean canWithdrawMoney (){
        return getDate_of_opening().minusYears(1).lengthOfYear() >= 0;
    }

    public void withdrawMoney (){
        if (canWithdrawMoney()) {
            System.out.println("Withdraw money");
        } else{
            System.out.println("Denied");
        }
    }

    public void deposit (double amountToBeDeposited){
        setAccountBalance(amountToBeDeposited);
    }

    @Override
    public String toString() {
        return "FixedSavings{}";
    }
}
