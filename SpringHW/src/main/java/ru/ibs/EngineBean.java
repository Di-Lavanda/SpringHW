package ru.ibs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class EngineBean {
    @Bean
    public HashMap<String, Engine> engineMapAdv(){
        HashMap<String,Engine> engineMap = new HashMap<>();
        engineMap.put("petrol", new PetrolEngine());
        engineMap.put("diesel", new DieselEngine());
        return engineMap;
    }
}
