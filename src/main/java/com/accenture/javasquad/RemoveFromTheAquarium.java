package com.accenture.javasquad;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class RemoveFromTheAquarium implements Execute {
    public RemoveFromTheAquarium(List<Fish> fffish) {
        this.fffish = fffish;
    }

    List<Fish> fffish;

    @Override
    public void execute() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please type in the name of the fish, you want to remove from aquarium");
        String nameOfTheFishToRemove = scanner1.nextLine();
        //fffish.removeIf(fish-> fish.getName().equals(nameOfTheFishToRemove));
        Fish tempFish = null;
        for (Fish fish : fffish) {
            if (fish.getName().equals(nameOfTheFishToRemove)) {
                tempFish = fish;
            }
            if (tempFish != null) {

                fffish.remove(fish);
                break;
            } else {

                System.out.println("This fish is not in the aquarium yet, try again");

            }
        }

    }
    /*Iterator<User> it = list.iterator();
    while (it.hasNext()) {
    User user = it.next();
    if (user.getName().equals("John Doe")) {
    it.remove();
    }*/


    @Override
    public boolean shouldExecute(String userChoice) {

        return "remove".equals(userChoice);
    }
}
/*Iterator<String> iter = list.iterator();
while (iter.hasNext())
{
    User user = iter.next();
    if(user.name.equals("user1"))
    {
        //Use iterator to remove this User object.
        iter.remove();
    }
}*/