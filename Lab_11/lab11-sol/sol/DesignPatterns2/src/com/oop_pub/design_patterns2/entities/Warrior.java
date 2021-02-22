package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.WarriorStrategy;

public class Warrior extends Hero {

    private int damage;

    public Warrior(String name, int i) {

        this.name = name;
        this.damage = i;
        this.strategy = new WarriorStrategy(this);
        this.hp = 120;
    }

    @Override
    public void attack() {
        if (canAttack()) {
            strategy.attack(target);
            setHP(getHP() - target.getDmg());
            System.out.println(this.getName() + "is attacking " + target.getName());
        }
    }

    @Override
    public String toString() {
        return new String("Mighty Warrior " + name + " of strength " + damage);
    }

    public int getBaseDamage() {
        return damage;
    }
}
