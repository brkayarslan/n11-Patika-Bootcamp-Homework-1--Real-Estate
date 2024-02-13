package com.berkayarslan.FirstHomework;

import com.berkayarslan.FirstHomework.Model.Cottage;
import com.berkayarslan.FirstHomework.Model.House;
import com.berkayarslan.FirstHomework.Model.Villa;
import com.berkayarslan.FirstHomework.Service.ResidentialPropertyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstHomeworkApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstHomeworkApplication.class, args);

		ResidentialPropertyService residentialPropertyService = context.getBean(ResidentialPropertyService.class);


		residentialPropertyService.printAllResidentialPropertiesTable();

		System.out.println("\n");

		System.out.println("Total House Price: " + String.format("%,.2f",residentialPropertyService.getTotalPriceOfPropertyType(House.class)));

		System.out.println("Total Villa Price: " + String.format("%,.2f",residentialPropertyService.getTotalPriceOfPropertyType(Villa.class)));

		System.out.println("Total Cottage Price: " + String.format("%,.2f",residentialPropertyService.getTotalPriceOfPropertyType(Cottage.class)));

		System.out.println("Total Residential Property Price: " + String.format("%,.2f",residentialPropertyService.getTotalPriceOfResidentialProperty())+"\n");

		System.out.println("Avarage Square Meters Of House: " + String.format("%,.2f",residentialPropertyService.getAverageSquareMetersOfPropertyType(House.class)) + " m\u00B2");

		System.out.println("Avarage Square Meters Of Villa: " +  String.format("%,.2f",residentialPropertyService.getAverageSquareMetersOfPropertyType(Villa.class)) + " m\u00B2");

		System.out.println("Avarage Square Meters Of Cottage: " + String.format("%,.2f",residentialPropertyService.getAverageSquareMetersOfPropertyType(Cottage.class)) + " m\u00B2");

		System.out.println("Avarage Square Meters Of Residential Property: " + 	String.format("%,.2f",residentialPropertyService.getAverageSquareMetersOfResidentialProperty()) + " m\u00B2 \n");

		residentialPropertyService.printFilterPropertyByRoomsTable(3,1);

	}

}
