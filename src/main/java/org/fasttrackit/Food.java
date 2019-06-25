package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    private String name;
    private int quantity;
    private Double price;
    private LocalDate expirationDate;
    private boolean availabilityInStock;

    public Food(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(boolean availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }
}