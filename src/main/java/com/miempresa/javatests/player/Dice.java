package com.miempresa.javatests.player;

import java.util.Random;

//clase dado
public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll(){
        return new Random().nextInt(sides) + 1;//dará un numero entre 1 y 6, caso contrario es entre 0 y 5

    }
}
