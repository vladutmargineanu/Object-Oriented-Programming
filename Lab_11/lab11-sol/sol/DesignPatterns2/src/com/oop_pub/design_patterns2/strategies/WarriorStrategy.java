package com.oop_pub.design_patterns2.strategies;

import com.oop_pub.design_patterns2.entities.Monster;
import com.oop_pub.design_patterns2.entities.Treasure;
import com.oop_pub.design_patterns2.entities.Warrior;

public class WarriorStrategy implements Strategy {
    private Warrior warrior;

    public WarriorStrategy(Warrior warrior) {
        this.warrior = warrior;
    }

    // if hero type weapon found use it
    // else if counter weapon found use it
    // else basic attack
    public void attack(Monster m) {
        Treasure.DamageType weakness = m.getWeakness();

        Treasure weapon1 = null;
        Treasure weapon2 = null;
        if (warrior.getInventory() != null)
            for (Treasure t : warrior.getInventory()) {
                if (t.getDamageType() == weakness)
                    weapon2 = t;
                if (t.getDamageType() == Treasure.DamageType.Blunt)
                    weapon1 = t;
            }

        if (weapon1 != null) {
            System.out.println("Hero attacks with " + (3 * weapon1.getDmg()) + " damage");
            m.setHP(m.getHP() - (3 * weapon1.getDmg()));
        } else if (weapon2 != null) {
            System.out.println("Hero attacks with " + (2 * weapon2.getDmg()) + " damage");
            m.setHP(m.getHP() - (2 * weapon2.getDmg()));
        } else {
            System.out.println("Hero attacks with " + warrior.getBaseDamage() + " damage");
            m.setHP(m.getHP() - warrior.getBaseDamage());
        }
    }
}
