package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    Adopter adopter;
    Animal dog;
    Vet vet;

    private List<Food> availableFood = new ArrayList<>();
    private RecreationalActivity[] availableActivities = new RecreationalActivity[3];

    public void start (){
    initFood();
    initActivities();

    displayAvailableFood();
    displayAvailableActivities();



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

}



