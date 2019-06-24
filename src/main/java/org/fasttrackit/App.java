package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Animal animal = new Animal();
        animal.name = "Bubico";
        animal.age = 1;
        animal.favoriteFood = "bones";
        animal.levelOfHealth = 7;
        animal.levelOfHunger = 10;
        animal.levelOfMood = 6;
        animal.favoriteRecreationalActivity = "running";

       Adopter adopter = new Adopter();
       adopter.name = "Caroline";
       adopter.amountOfMoneyAvailable = 300;

        Food food = new Food();
        food.name = "Pedigree";
        food.price = 30.99;
        food.expirationDate = LocalDate.of(2020,2,22);
        food.quantity = 100;
        food.availabilityInStock = true;


       RecreationalActivity recreationalActivity = new RecreationalActivity();
       recreationalActivity.name = "running in the park";

       Vet vet = new Vet();
       vet.name = "Dr. Jason Lee ";
       vet.specialty = "internal medicine";

       PetAccessories accessories = new PetAccessories();
       accessories.name = "ball";
       accessories.price = 10.12;
       accessories.type = "toys";
       accessories.brands = "KONG";
       accessories.color = "blue";

    }
}
