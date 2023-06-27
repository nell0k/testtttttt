package com.accenture.javasquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddToAquarium implements Execute {
    public AddToAquarium(Scanner scanner, List<Fish> fffish) {
        this.scanner = scanner;
        this.fffish = fffish;
    }

    Scanner scanner;
    List<Fish> fffish;

    public boolean shouldExecute(String userChoice) {
        return "add".equals(userChoice);
    }

    public void execute() {
        System.out.println("Please type in if its a 'predator Fish' or it's a 'pray Fish'");
        String fishType = scanner.nextLine();

        System.out.println("What is the name of your fish");
        String fishName = scanner.nextLine();

        if ("predator Fish".equals(fishType)) {
            System.out.println("Please type 'shark', if your predator Fish is shark");
            String predatorFishType= scanner.nextLine();
            if ("shark".equals(predatorFishType)){
                Fish shark=new Shark();
                shark.name=fishName;
                fffish.add(shark);
            } else {
                Fish predatorFish = new PredatorFish();
                predatorFish.name = fishName;
                fffish.add(predatorFish);
            }
        } else if ("pray Fish".equals(fishType)) {
            Fish prayFish = new PrayFish();
            prayFish.name = fishName;
            fffish.add(prayFish);
        }
        System.out.println("Added " + fishName);
    }
}
