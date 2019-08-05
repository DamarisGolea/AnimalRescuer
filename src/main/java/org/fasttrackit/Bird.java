package org.fasttrackit;

public class Bird extends Animal {
    private String species;
    private boolean abilityToFly;


    public Bird(String name, int levelOfHunger) {
        super(name, levelOfHunger);
    }

    @Override
    public void positiveMood() {
        System.out.println(getName() + " is singing.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isAbilityToFly() {
        return abilityToFly;
    }

    public void setAbilityToFly(boolean abilityToFly) {
        this.abilityToFly = abilityToFly;
    }
}
