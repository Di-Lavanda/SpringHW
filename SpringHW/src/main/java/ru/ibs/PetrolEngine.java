package ru.ibs;

import org.springframework.stereotype.Service;

@Service
public class PetrolEngine implements Engine{
    @Override
    public String powerUp(){
        return "Petrol";
    }
}
