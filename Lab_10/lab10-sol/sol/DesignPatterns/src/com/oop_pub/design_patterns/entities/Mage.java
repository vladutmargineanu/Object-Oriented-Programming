package com.oop_pub.design_patterns.entities;

public class Mage extends Hero {

    private int magicalDamage;

    public Mage(String name, int i) {

        this.name = name;
        this.magicalDamage = i;
    }

    @Override
    public void attack() {
        System.out.println("Not Implemented");
    }

    public void magicAttack() {
        System.out.println("Not Implemented");
    }

    @Override
    public String toString() {
        return new String("Powerful Mage " + name + " of strength " + magicalDamage);
    }
}