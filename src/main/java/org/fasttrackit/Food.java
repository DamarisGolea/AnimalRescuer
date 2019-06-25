package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    String name;
    int quantity;
    Double price;
    LocalDate expirationDate;
    boolean availabilityInStock;

    public Food(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }
}