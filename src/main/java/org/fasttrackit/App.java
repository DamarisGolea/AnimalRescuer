package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Animal dog = new Mammal("Bubico", 10);
        dog.age = 1;
        dog.favoriteFood = "bones";
        dog.levelOfHealth = 7;
        dog.levelOfMood = 6;
        dog.favoriteRecreationalActivity = "running";

        Adopter adopter = new Adopter("Caroline", "F");
        adopter.amountOfMoneyAvailable = 300;

        Food food = new Food("Pedigree", LocalDate.of(2020,2,22));
        food.price = 30.99;
        food.quantity = 100;
        food.availabilityInStock = true;


        RecreationalActivity recreationalActivity = new RecreationalActivity("running in the park");
        recreationalActivity.type = "sport";
        recreationalActivity.durationInMinutes = 30;

        Vet vet = new Vet("Jason Lee", "M");
        vet.specialty = "internal medicine";

        PetAccessory accessories = new PetAccessory("toys",10.12);
        accessories.name = "ball";
        accessories.brands = "KONG";
        accessories.color = "blue";

    }
}
