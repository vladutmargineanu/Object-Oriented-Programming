package com.oop_pub.design_patterns.factories;

import com.oop_pub.design_patterns.entities.Treasure;

import java.util.Random;

/**
 * Builds random treasure objects. Hides the treasure creation mechanism using
 * a factory method.
 */
public class TreasureFactory {
    private static TreasureFactory factory = null;

    public static TreasureFactory getInstance() {
        if (factory == null) {
            factory = new TreasureFactory();
        }

        return factory;
    }

    private TreasureFactory() {
    }

    public Treasure createTreasure() {
        String[] names = {"Sword of Justice",
                "Leg of St Andrew",
                "Rabbit's Foot",
                "5-leaf Clover",
                "Shield of the Wise"};
        String[] lore = {"it looks quite old",
                "you've heard of this before",
                "tales of this legendary item are told in each tavern"};

        Random rand = new Random();

        return new Treasure(names[rand.nextInt(names.length)], lore[rand.nextInt(lore.length)]);
    }
}