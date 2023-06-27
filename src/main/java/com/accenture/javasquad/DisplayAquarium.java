package com.accenture.javasquad;

import java.util.List;

public class DisplayAquarium implements Execute {
    List<Fish> fffish;

    public DisplayAquarium(List<Fish> fffish) {

        this.fffish = fffish;
    }

    public boolean shouldExecute(String userChoice) {
        return "show".equals(userChoice);
    }

    public void execute() {
        for (Fish fish : fffish) {
            System.out.println(fish.name+" says: ");
            fish.eat();
        }
    }
}
