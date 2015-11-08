package com.mascot.team.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by henry on 11/5/15.
 */
public class ColorWheel {


    public String[] mColor = {
            "#b7c0c7",
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0"
    };

    public int getColor() {

        //Button was clicked update the fact buttom with a new fact

        Random RandomGenerator = new Random();
        int randomNumber = RandomGenerator.nextInt(mColor.length);

        String color = mColor[randomNumber];
        int colorAsInt =  Color.parseColor(color);

        return colorAsInt;
    }
}