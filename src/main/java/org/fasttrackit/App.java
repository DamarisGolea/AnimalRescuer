package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();

        // Creation of objects
        Animal dog = new Mammal("Bubico", 10);
        dog.setAge(1);
        dog.setFavoriteFood("Pedigree");
        dog.setLevelOfHealth(7);
        dog.setLevelOfMood(6);
        dog.setFavoriteRecreationalActivity("playing with the ball");

        Animal animal = new Animal("Jerry", 9);
        Animal bird = new Bird("Max", 1);

        System.out.println(dog.getName());

        Adopter adopter = new Adopter("Caroline", "F");
        adopter.setAmountOfMoneyAvailable(300);

        System.out.println(adopter.getAmountOfMoneyAvailable());

        Food food = new Food("Pedigree", LocalDate.of(2020, 2, 22));
        food.setPrice(30.99);
        food.setQuantity(100);
        food.setAvailabilityInStock(true);

        System.out.println(food.getExpirationDate());

        RecreationalActivity recreationalActivity = new RecreationalActivity("running in the park");
        recreationalActivity.setType("sport");
        recreationalActivity.setDurationInMinutes(30);

        System.out.println(recreationalActivity.getName());

        Vet vet = new Vet("Jason Lee", "M");
        vet.setSpecialty("internal medicine");

        System.out.println(vet.getName());

        PetAccessory accessory = new PetAccessory("toys", 10.12);
        accessory.setName("ball");
        accessory.setBrand("KONG");
        accessory.setColor("blue");

        System.out.println(accessory.getType());

        adopter.feeding(dog, food);
        System.out.println("Bubico ate some Pedigree.");

        adopter.activityDoing(dog, recreationalActivity);
        System.out.println("Bubico had some recreational activity.");

        // Homework
        // Polymorphism
        dog.positiveMood();
        bird.positiveMood();
        animal.positiveMood();

//        System.out.println(dog instanceof Animal);
//        System.out.println(dog instanceof Mammal);
//        System.out.println(animal instanceof Mammal);
    }
}