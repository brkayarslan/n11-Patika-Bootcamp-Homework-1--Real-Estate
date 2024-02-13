package com.berkayarslan.FirstHomework.Model;

public class Villa extends ResidentialProperty{

    public Villa(String adress, int squareMeters, int propertyPrice, int yearBuilt, int numLivingRooms, int numBedrooms, int numBathrooms, boolean hasGarden, boolean hasPool) {
        super(adress, squareMeters, propertyPrice, yearBuilt, numLivingRooms, numBedrooms, numBathrooms, hasGarden, hasPool);
    }
}
