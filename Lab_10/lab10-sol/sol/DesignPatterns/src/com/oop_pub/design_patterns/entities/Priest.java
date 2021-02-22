package com.oop_pub.design_patterns.entities;

public class Priest extends Hero {

    private int knowledge;

    public Priest(String name, int i) {

        this.name = name;
        this.knowledge = i;
    }

    @Override
    public void attack() {
        System.out.println("Not Implemented");
    }

    public void heal() {
        System.out.println("Not Implemented");
    }

    @Override
    public String toString() {
        return new String("Sneaky Priest " + name + " of knowledge " + knowledge);
    }
}
