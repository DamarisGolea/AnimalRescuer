package org.fasttrackit;

public class Mammal extends Animal {
    private String breed;
    private String color;

    public Mammal(String name, int levelOfHunger) {
        super(name, levelOfHunger);
    }

    @Override
    public void positiveMood() {
        System.out.println(getName() + " is tail wagging.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
