package org.example.mallon;

public class CreditBuilderCard extends CreditCard{
    public CreditBuilderCard(String rateOfInterest, int minScore, int maxScore, int annualFee, int minLimit, int maxLimit) {
        super(rateOfInterest, minScore, maxScore, annualFee, minLimit, maxLimit);
    }

    @Override
    public String toString() {
        return "CreditBuilderCard{}";
    }
}
