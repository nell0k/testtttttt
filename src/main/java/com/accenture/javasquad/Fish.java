package com.accenture.javasquad;

public abstract class Fish {
    public String getName() {
        return name;
    }
    public int size;
    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public abstract void eat();

}