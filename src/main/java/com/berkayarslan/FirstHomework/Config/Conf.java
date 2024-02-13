package com.berkayarslan.FirstHomework.Config;

import com.berkayarslan.FirstHomework.Model.Cottage;
import com.berkayarslan.FirstHomework.Model.House;
import com.berkayarslan.FirstHomework.Model.Villa;
import com.berkayarslan.FirstHomework.Service.ResidentialPropertyService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {


    @Autowired
    private ResidentialPropertyService residentialPropertyService;

    @PostConstruct
    public void configuration() {

        residentialPropertyService.addResidentialProperty(new House("İstanbul/Kadıköy/Fikirtepe",55,3200000,2019,1,1,1,false,true));
        residentialPropertyService.addResidentialProperty(new House("Bursa/Nilüfer/Balat",120,4250000,2005,2,5,3,false,true));
        residentialPropertyService.addResidentialProperty(new House("Ankara/Gölbaşı/Karşıyaka",150,3785000,2013,1,3,2,true,false));


        residentialPropertyService.addResidentialProperty(new Villa("Eskişehir/Odunpazarı/Akarbaşı",140,1840000,2017,1,2,1,false,false));
        residentialPropertyService.addResidentialProperty(new Villa("İzmir/Çeşme/Alaçatı",95,2763000,2008,1,3,1,true,false));
        residentialPropertyService.addResidentialProperty(new Villa("Antalya/Serik/Belek",78,4125000,2022,2,5,4,true,true));


        residentialPropertyService.addResidentialProperty(new Cottage("Mersin/Akdeniz/Siteler",138,3189000,2015,1,3,1,false,true));
        residentialPropertyService.addResidentialProperty(new Cottage("Trabzon/Ortahisar/Erdoğdu",184,2786000,2006,1,4,2,false,false));
        residentialPropertyService.addResidentialProperty(new Cottage("Erzurum/Yakutiye/Muratpaşa",97,3642000,2013,1,5,3,true,true));


    }
}
