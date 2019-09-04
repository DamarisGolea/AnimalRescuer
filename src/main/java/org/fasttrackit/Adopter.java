package org.fasttrackit;

import org.fasttrackit.domain.Animal;

public class Adopter extends Person {
    private double amountOfMoneyAvailable;

    public Adopter(String name, String sex) {
        super(name, sex);
    }

    public void feeding(Animal animal, Food food) {

        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName() + ".");
        System.out.println("Hunger level is now: " + (animal.getLevelOfHunger() - 1));

        if (food.getName() == animal.getFavoriteFood()) {
            int animalmood = animal.getLevelOfMood() + 1;
            System.out.println(animal.getName() + " ate its favorite food and its level of mood is now: " + animalmood );
        } else {
            System.out.println("I'm not hungry anymore, but I did't get my favorite food.");
        }

    }

    public void activityDoing(Animal animal, RecreationalActivity recreationalActivity) {

        System.out.println(getName() + " and " + animal.getName() + " are " + recreationalActivity.getName() + ".");

        if (recreationalActivity.getName() == animal.getFavoriteRecreationalActivity()){
            int animalmood = animal.getLevelOfMood() + 2;
            System.out.println(animal.getName() + " did its favorite recreational activity " +
                    "and its level of mood is now: " + animalmood );
        } else {
            int animalmood = animal.getLevelOfMood() + 1;
            System.out.println("Even if I have not done my favorite recreational activity, I'm feeling better now and " +
                    "my level of mood is: " + animalmood);
        }

    }

    public double getAmountOfMoneyAvailable() {
        return amountOfMoneyAvailable;
    }

    public void setAmountOfMoneyAvailable(double amountOfMoneyAvailable) {
        this.amountOfMoneyAvailable = amountOfMoneyAvailable;
    }

}
