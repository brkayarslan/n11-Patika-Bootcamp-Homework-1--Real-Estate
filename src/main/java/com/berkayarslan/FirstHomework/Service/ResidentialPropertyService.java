package com.berkayarslan.FirstHomework.Service;

import com.berkayarslan.FirstHomework.Model.ResidentialProperty;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResidentialPropertyService {


    private List<ResidentialProperty> residentialPropertyList = new ArrayList<>();


    public void addResidentialProperty(ResidentialProperty residentialProperty){
        residentialPropertyList.add(residentialProperty);
    }
    public List<ResidentialProperty> getResidentialPropertyList() {
        return residentialPropertyList;
    }
    public void printAllResidentialPropertiesTable(){
        // Tablo başlıkları
        System.out.printf("%-10s %-30s %-15s %-15s %-15s %-15s %-15s %-15s %-10s %-5s%n",
                "Id","Address", "Square Meters", "Price", "Year Built","Living Rooms",
                "Bedrooms", "Bathrooms", "Garden", "Pool");
        // Çizgi ile ayrım
        System.out.printf("%-10s %-30s %-15s %-15s %-15s %-15s %-15s %-15s %-10s %-5s%n",
                "----------", "------------------------------", "---------------",
                "---------------", "---------------", "---------------", "---------------",
                "---------------", "----------", "-----");

        getResidentialPropertyList().forEach(property ->
                System.out.printf("%-10d %-30s %-15d %-15s %-15d %-15d %-15d %-15d %-10b %-5b%n",
                        property.getId(),property.getAddress(), property.getSquareMeters(),
                        String.format("₺%,10d", property.getPropertyPrice()), property.getYearBuilt(),
                        property.getNumLivingRooms(),property.getNumBedrooms(), property.getNumBathrooms(),
                        property.isHasGarden(), property.isHasPool()));

    }
    public double getTotalPriceOfResidentialProperty(){

        return residentialPropertyList.stream()
                .mapToDouble(ResidentialProperty::getPropertyPrice)
                .sum();
    }
    public double getTotalPriceOfPropertyType(Class<? extends ResidentialProperty> propertyType){
        return residentialPropertyList.stream()
                .filter(propertyType::isInstance)
                .mapToDouble(ResidentialProperty::getPropertyPrice)
                .sum();
    }
    public double getAverageSquareMetersOfResidentialProperty(){

        return residentialPropertyList.stream()
                .mapToDouble(ResidentialProperty::getSquareMeters)
                .average()
                .orElse(0);
    }
    public double getAverageSquareMetersOfPropertyType(Class<? extends ResidentialProperty> propertyType){
        return residentialPropertyList.stream()
                .filter(propertyType::isInstance)
                .mapToDouble(ResidentialProperty::getSquareMeters)
                .average()
                .orElse(0);
    }
    public List<ResidentialProperty> getFilterPropertyByRooms(int numBedrooms,int numLivingRooms){
        List<ResidentialProperty> filteredResidentialProperties = new ArrayList<>();
        filteredResidentialProperties.addAll(residentialPropertyList.stream().filter(h -> h.getNumBedrooms() == numBedrooms && h.getNumLivingRooms() == numLivingRooms).toList());
        return filteredResidentialProperties;

    }
    public void printFilterPropertyByRoomsTable(int numBedrooms,int numLivingRooms){
        // Tablo başlıkları
        System.out.printf("%-30s %-15s %-15s %-15s %-15s %-15s %-15s %-10s %-5s%n",
                "Address", "Square Meters", "Price", "Year Built","Living Rooms",
                "Bedrooms", "Bathrooms", "Garden", "Pool");
        // Çizgi ile ayrım
        System.out.printf("%-30s %-15s %-15s %-15s %-15s %-15s %-15s %-10s %-5s%n",
                "------------------------------", "---------------",
                "---------------", "---------------", "---------------", "---------------",
                "---------------", "----------", "-----");

        getFilterPropertyByRooms(numBedrooms,numLivingRooms).forEach(property ->
                System.out.printf("%-30s %-15d %-15s %-15d %-15d %-15d %-15d %-10b %-5b%n",
                        property.getAddress(), property.getSquareMeters(),
                        String.format("₺%,10d", property.getPropertyPrice()), property.getYearBuilt(),
                        property.getNumLivingRooms(),property.getNumBedrooms(), property.getNumBathrooms(),
                        property.isHasGarden(), property.isHasPool()));

    }

}
