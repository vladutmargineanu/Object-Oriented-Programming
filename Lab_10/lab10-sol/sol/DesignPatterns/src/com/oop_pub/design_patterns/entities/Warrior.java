package com.oop_pub.design_patterns.entities;

public class Warrior extends Hero {

    private int damage;

    public Warrior(String name, int i) {

        this.name = name;
        this.damage = i;
    }

    @Override
    public void attack() {

        System.out.println("Not Implemented");
    }

    @Override
    public String toString() {
        return new String("Mighty Warrior " + name + " of strength " + damage);
    }
}