package org.fasttrackit;

public class Adopter extends Person {
    private double amountOfMoneyAvailable;

    public Adopter(String name, String sex) {
        super(name, sex);
    }

    public double getAmountOfMoneyAvailable() {
        return amountOfMoneyAvailable;
    }

    public void setAmountOfMoneyAvailable(double amountOfMoneyAvailable) {
        this.amountOfMoneyAvailable = amountOfMoneyAvailable;
    }
}
