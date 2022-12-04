package com.example.ordenamientoListas;

import java.util.Random;

public class OrderLogic {
    
    public Integer randomNumber(){

        int min = 1, max = 1000;
        Random random = new Random();

        Integer number = random.nextInt(min,max) + 1;
        
        return number;
    }
    
    
    
}
