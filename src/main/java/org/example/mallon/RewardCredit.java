package org.example.mallon;

public class RewardCredit extends CreditCard{
    private double pointsPerDebitTransactions;

    public RewardCredit(String rateOfInterest, int minScore, int annualFee, int minLimit, int maxLimit, double pointsPerDebitTransactions) {
        super(rateOfInterest, minScore, annualFee, minLimit, maxLimit);
        this.pointsPerDebitTransactions = pointsPerDebitTransactions;
    }

    @Override
    public String toString() {
        return "RewardCredit";
    }
}
