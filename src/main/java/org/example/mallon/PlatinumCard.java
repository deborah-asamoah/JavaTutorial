package org.example.mallon;

public class PlatinumCard extends CreditCard{
    private double cashBackRate;


    public PlatinumCard(String rateOfInterest, int minScore, int annualFee, int minLimit, double cashBackRate) {
        super(rateOfInterest, minScore, annualFee, minLimit);
        this.cashBackRate = cashBackRate;
    }

    @Override
    public String toString() {
        return "PlatinumCard";
    }
}

