package com.accenture.javasquad;

public class Exit implements Execute {
    public boolean shouldExecute(String userChoice) {
        return "exit".equals(userChoice);
    }

    public void execute() {
        System.out.println("Goodbye.");
        System.exit(0);
    }
}