package com.berkayarslan.FirstHomework.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;


@Getter
@Setter
public abstract  class ResidentialProperty {

    @Setter(AccessLevel.PRIVATE)
    private long id;
    private String address;
    private int squareMeters;
    private int propertyPrice;
    private int yearBuilt;
    private int numLivingRooms;
    private int numBedrooms;
    private int numBathrooms;
    private boolean hasGarden;
    private boolean hasPool;

    private static final AtomicLong idCounter = new AtomicLong();

    public ResidentialProperty(String adress, int squareMeters, int propertyPrice, int yearBuilt, int numLivingRooms, int numBedrooms, int numBathrooms, boolean hasGarden, boolean hasPool) {
        this.id = idCounter.incrementAndGet();
        this.address = adress;
        this.squareMeters = squareMeters;
        this.propertyPrice = propertyPrice;
        this.yearBuilt = yearBuilt;
        this.numLivingRooms = numLivingRooms;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.hasGarden = hasGarden;
        this.hasPool = hasPool;
    }
}
