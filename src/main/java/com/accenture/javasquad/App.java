package com.accenture.javasquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args ) {

        new App().run();
    }
    public void run() {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        List<Fish> fffish = new ArrayList<>();
        List<Execute> executes = createExecutesList(scanner, (ArrayList<Fish>) fffish);

        while (true) {
            System.out.printf("Please type in 'hello'- to say 'hello' to me) Please type in 'add'- to add one fish to aquarium please type in 'eat'- to know,what the fish eatsplease type in 'show'- if you want to display which fishes are in the aquarium please type in 'remove'- if you want to remove fish from aquariumplease type in 'exit'- if you want to stop%n");
            String userChoice = scanner.nextLine();
            boolean wrongInput = true;
            for (Execute execute : executes) {
                if (execute.shouldExecute(userChoice)) {
                    execute.execute();
                    wrongInput = false;
                }
            }
            if (wrongInput) {
                System.out.println("please type in only the commands mentioned above");
            }
        }
    }
    public List<Execute> createExecutesList(Scanner scanner, ArrayList<Fish> fffish) {
        List<Execute> executes = new ArrayList<>();
        executes.add(new SayHello());
        executes.add(new AddToAquarium(scanner, fffish));
        executes.add(new ToEat(fffish));
        executes.add(new DisplayAquarium(fffish));
        executes.add(new Exit());
        executes.add(new RemoveFromTheAquarium(fffish));
        return executes;
    }

}
