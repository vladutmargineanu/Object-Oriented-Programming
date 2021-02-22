package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.PriestStrategy;

public class Priest extends Hero {

    private int knowledge;

    public Priest(String name, int i) {

        this.name = name;
        this.knowledge = i;
        this.strategy = new PriestStrategy(this);
        this.hp = 100;
    }

    @Override
    public void attack() {
        if (canAttack()) {
            strategy.attack(target);
            setHP(getHP() - target.getDmg());
            System.out.println(this.getName() + "is attacking " + target.getName());
        }
    }

    public void heal() {
        System.out.println("Not Implemented");
    }

    @Override
    public String toString() {
        return new String("Sneaky Priest " + name + " of knowledge " + knowledge);
    }

    public int getBaseDamage() {
        return knowledge;
    }
}
