package com.oop_pub.design_patterns2.strategies;

import com.oop_pub.design_patterns2.entities.Mage;
import com.oop_pub.design_patterns2.entities.Monster;
import com.oop_pub.design_patterns2.entities.Treasure;

public class MageStrategy implements Strategy {
    private Mage mage;

    public MageStrategy(Mage mage) {
        this.mage = mage;
    }

    // if hero type weapon found use it
    // else if counter weapon found use it
    // else basic attack
    public void attack(Monster m) {
        Treasure.DamageType weakness = m.getWeakness();

        Treasure weapon1 = null;
        Treasure weapon2 = null;
        if (mage.getInventory() != null)
            for (Treasure t : mage.getInventory()) {
                if (t.getDamageType() == weakness)
                    weapon2 = t;
                if (t.getDamageType() == Treasure.DamageType.Magic)
                    weapon1 = t;
            }

        if (weapon1 != null) {
            System.out.println("Hero attacks with " + (3 * weapon1.getDmg()) + " damage");
            m.setHP(m.getHP() - (3 * weapon1.getDmg()));
        } else if (weapon2 != null) {
            System.out.println("Hero attacks with " + (2 * weapon2.getDmg()) + " damage");
            m.setHP(m.getHP() - (2 * weapon2.getDmg()));
        } else {
            System.out.println("Hero attacks with " + mage.getBaseDamage() + " damage");
            m.setHP(m.getHP() - mage.getBaseDamage());
        }
    }
}
