package com.oop_pub.design_patterns2.strategies;

import com.oop_pub.design_patterns2.entities.Monster;
import com.oop_pub.design_patterns2.entities.Priest;
import com.oop_pub.design_patterns2.entities.Treasure;

public class PriestStrategy implements Strategy {
    private Priest priest;

    public PriestStrategy(Priest priest) {
        this.priest = priest;
    }

    // if hero type weapon found use it
    // else if counter weapon found use it
    // else basic attack
    public void attack(Monster m) {
        Treasure.DamageType weakness = m.getWeakness();

        Treasure weapon1 = null;
        Treasure weapon2 = null;
        if (priest.getInventory() != null)
            for (Treasure t : priest.getInventory()) {
                if (t.getDamageType() == weakness)
                    weapon2 = t;
                if (t.getDamageType() == Treasure.DamageType.Poison)
                    weapon1 = t;
            }

        if (weapon1 != null) {
            System.out.println("Hero attacks with " + (3 * weapon1.getDmg()) + " damage");
            m.setHP(m.getHP() - (3 * weapon1.getDmg()));
        } else if (weapon2 != null) {
            System.out.println("Hero attacks with " + (2 * weapon2.getDmg()) + " damage");
            m.setHP(m.getHP() - (2 * weapon2.getDmg()));
        } else {
            System.out.println("Hero attacks with " + priest.getBaseDamage() + " damage");
            m.setHP(m.getHP() - priest.getBaseDamage());
        }
    }
}
