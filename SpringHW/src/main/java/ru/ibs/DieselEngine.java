package ru.ibs;

import org.springframework.stereotype.Service;

@Service
public class DieselEngine implements Engine{
    @Override
    public String powerUp() {
        return "Diesel";
    }
}
