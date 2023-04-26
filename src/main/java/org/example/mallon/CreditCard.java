package org.example.mallon;

public abstract class CreditCard {
    private String rateOfInterest;
    private int minScore;
    private int maxScore;
    private int annualFee;
    private int minLimit;
    private int maxLimit;

    public CreditCard() {
    }

    public CreditCard(String rateOfInterest, int minScore, int annualFee, int minLimit) {
        this.rateOfInterest = rateOfInterest;
        this.minScore = minScore;
        this.annualFee = annualFee;
        this.minLimit = minLimit;
    }


    public CreditCard(String rateOfInterest, int minScore, int annualFee, int minLimit, int maxLimit) {
        this.rateOfInterest = rateOfInterest;
        this.minScore = minScore;
        this.annualFee = annualFee;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }



    public CreditCard(String rateOfInterest, int minScore, int maxScore, int annualFee, int minLimit, int maxLimit) {
        this.rateOfInterest = rateOfInterest;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.annualFee = annualFee;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    public String getRateOfInterest() {
        return rateOfInterest;
    }

    public int getMinScore() {
        return minScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public int getAnnualFee() {
        return annualFee;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }


    public void setRateOfInterest(String rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public void setAnnualFee(int annualFee) {
        this.annualFee = annualFee;
    }

    public void setMinLimit(int minLimit) {
        this.minLimit = minLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }
}
