package com.accenture.javasquad;

public class SayHello implements Execute {

        public boolean shouldExecute(String userChoice) {
            return "hello".equals(userChoice);
        }

        public void execute() {

            System.out.println("hello and welcome");
        }


    }

