package ru.ibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class EngineBean {

    @Autowired
    PetrolEngine petrolExp;
    @Autowired
    DieselEngine dieselExp;

    @Bean
    public HashMap<String, Engine> engineMapAdv(){
        HashMap<String,Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", petrolExp);
        engineMap.put("diesel", dieselExp);
        return engineMap;
    }
}