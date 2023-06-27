package com.accenture.javasquad;

import java.util.ArrayList;

public class ToEat implements Execute {

    public ToEat(ArrayList<Fish> fffish) {
        this.fffish = fffish;
    }

    private ArrayList<Fish> fffish;


    @Override
    public void execute() {
        for (Fish fish : fffish) {
            fish.eat();
        }
    }

    @Override
    public boolean shouldExecute(String userChoice) {
        return "eat".equals(userChoice);
    }
}

