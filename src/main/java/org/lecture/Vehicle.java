package org.lecture;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Vehicle {
    private UUID id;
    private boolean available;
    private double rentalPricePerDay;

    public Vehicle(boolean available, double rentalPricePerDay) {
        this.id = UUID.randomUUID();
        this.available = available;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public abstract void displayInfo();
}
