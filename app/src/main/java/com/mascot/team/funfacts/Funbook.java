package com.mascot.team.funfacts;

import java.util.Random;

/**
 * Created by henry on 11/5/15.
 */
public class Funbook {


    public String[] mfacts = {
            "Do you know that goats that have beards can speak when you give them meat",
            "Do you know that Ostriches run faster when they are hungry",
            "Do you know cats throw up when they see sour milk",
            "Do you know that Ostriches run faster when they are hungry",
            "Do you know that giraffe's taller than six feet can't sit down",
            "Do you know that snakes who drink alcohol can dance",
            "Do you know that zebra's dance during the full moon"
    };
    
    public String getFact(){

        //Button was clicked update the fact buttom with a new fact

        Random RandomGenerator = new Random();
        int randomNumber = RandomGenerator.nextInt(mfacts.length);

        String fact = mfacts[randomNumber];

        return fact;
    }
}
