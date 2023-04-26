package org.example.mallon;

public class BasicCard extends CreditCard{
    public BasicCard(String rateOfInterest, int minScore, int annualFee, int minLimit, int maxLimit) {
        super(rateOfInterest, minScore, annualFee, minLimit, maxLimit);
    }

    @Override
    public String toString() {
        return "BasicCard";
    }
}
