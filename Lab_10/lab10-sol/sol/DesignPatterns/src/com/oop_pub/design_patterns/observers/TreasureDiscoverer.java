package com.oop_pub.design_patterns.observers;

import com.oop_pub.design_patterns.entities.Hero;
import com.oop_pub.design_patterns.entities.Treasure;
import com.oop_pub.design_patterns.game.World;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

/**
 * Prints the lore of a treasure when a hero discovers it.
 */
public class TreasureDiscoverer implements Observer {

    public void update(Observable o, Object arg) {

        World gs = World.getInstance();

        ArrayList<Treasure> toRemove = new ArrayList<>();

        for (Hero h : gs.getParty()) {
            for (Treasure t : gs.getTreasures())

                if (h.getPosx() == t.getPosx() &&
                        h.getPosy() == t.getPosy()) {
                    System.out.println("Hero " + h.getName() + " has found a treasure:\n");
                    System.out.println(t.getName() + " - " + t.getLore());

                    // remove treasure from map and
                    // add to specific hero's inventory
                    h.collect(t);
                    toRemove.add(t);
                }
        }

        for (Treasure t : toRemove)
            gs.removeTreasure(t);
    }
}
