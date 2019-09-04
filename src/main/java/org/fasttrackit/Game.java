package org.fasttrackit;

import org.fasttrackit.domain.Animal;
import org.fasttrackit.domain.Mammal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {
    Adopter adopter;
    Animal dog;
    Vet vet;

    private List<Food> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[3];

    public void start () {
        initFood();
        initActivities();
        initAnimal();
        initAdopter();
        nameAnimal();
        displayAvailableFood();
        requireFeeding();
        displayAvailableActivities();
        requirePlaying();




    }


    private void initFood(){
        Food cheese = new Food("Cheese", LocalDate.of(2020, 5,23));
        cheese.setAvailabilityInStock(true);
        cheese.setPrice(12.04);
        
        availableFood.add(cheese);

        Food meat = new Food("chicken breast", LocalDate.of(2020, 7, 19));
        meat.setAvailabilityInStock(false);
        meat.setPrice(31.40);

        availableFood.add(meat);
    }

    private void initActivities() {
        RecreationalActivity withBall = new RecreationalActivity("football");
        withBall.setDurationInMinutes(50);

        availableActivities[0] = withBall;

        RecreationalActivity swimming = new RecreationalActivity("swimming");
        swimming.setDurationInMinutes(45);

        availableActivities[1]= swimming;

        RecreationalActivity waking = new RecreationalActivity("waking");
        waking.setDurationInMinutes(20);

        availableActivities[2] = waking;
    }

    private void displayAvailableFood() {
        System.out.println("Available food:");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood.get(i) != null) {
                System.out.println(i + 1 + ". " + availableFood.get(i).getName());
            }
        }
    }

    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (RecreationalActivity activities : availableActivities)
            if (availableActivities != null) {
                System.out.println(activities.getName());
            }

    }

    private void initAnimal(){
        Animal cat = new Mammal("Kitty", 3);
        cat.setSex("Female");
        cat.setAge(2);
        cat.setLevelOfMood(5);
        cat.setLevelOfHealth(9);
        cat.setFavoriteFood("fish");
        cat.setFavoriteRecreationalActivity("playing with ball of thread");
    }

    private void initAdopter(){
        Adopter adopter = new Adopter("x", "male");
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        try {
            scanner.nextLine();
        } catch (InputMismatchException e){
            System.out.println("You have entered an invalid value.");
            adopter.getName();
        }

    }

    private void nameAnimal (){
        System.out.println("Please give the animal you just saved a name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("The animal's name is: " + name + ".");
    }

    private void requireFeeding(){
        System.out.println("Please feed your animal.");
        for (int i=0; i<availableFood.size(); i++){
            System.out.println("You can choose: " + (i + 1) + " " + availableFood.get(i).getName() + ".");
        }
        System.out.println("Please select a number.");
        Scanner scanner = new Scanner(System.in);
        int foodChoice = scanner.nextInt();
        System.out.println("You chose: " + foodChoice + ".");
    }

    private void requirePlaying(){
        System.out.println("Please play with your animal.");
        for (int i=0; i<availableActivities.length; i++){
            System.out.println("You can choose: " + (i + 1) + " " + availableActivities[i].getName() + ".");
        }
        System.out.println("Please select a number.");
        Scanner scanner = new Scanner(System.in);
        int activityChoice = scanner.nextInt();
        System.out.println("You chose: " + activityChoice + ".");
    }

}



