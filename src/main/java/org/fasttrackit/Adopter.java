package org.fasttrackit;

public class Adopter extends Person {
    private double amountOfMoneyAvailable;

    public Adopter(String name, String sex) {
        super(name, sex);
    }

    public void feeding(Animal animal, Food food) {
        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName() + ".");
        System.out.println("Hunger level is now: " + (animal.getLevelOfHunger() - 1));

    }

    public void activityDoing(Animal animal, RecreationalActivity recreationalActivity) {
        System.out.println(getName() + " and " + animal.getName() + " are " + recreationalActivity.getName() + ".");
        System.out.println("Happiness level is now: " + (animal.getLevelOfMood() + 1));
    }

    public double getAmountOfMoneyAvailable() {
        return amountOfMoneyAvailable;
    }

    public void setAmountOfMoneyAvailable(double amountOfMoneyAvailable) {
        this.amountOfMoneyAvailable = amountOfMoneyAvailable;
    }

}
