package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.MageStrategy;

public class Mage extends Hero {

    private int magicalDamage;

    public Mage(String name, int i) {

        this.name = name;
        this.magicalDamage = i;
        this.strategy = new MageStrategy(this);
        this.hp = 90;

    }

    @Override
    public void attack() {
        if (canAttack()) {
            strategy.attack(target);
            setHP(getHP() - target.getDmg());
            System.out.println(this.getName() + "is attacking " + target.getName());
        }
    }

    public void magicAttack() {
        System.out.println("Not Implemented");
    }

    @Override
    public String toString() {
        return new String("Powerful Mage " + name + " of strength " + magicalDamage);
    }

    public int getBaseDamage() {
        return magicalDamage;
    }
}
