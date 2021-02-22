package com.oop_pub.design_patterns.observers;

/**
 * Observer that prints the game's world (the map with all the treasures,
 * heroes, obstacles)
 */

import com.oop_pub.design_patterns.entities.Hero;
import com.oop_pub.design_patterns.entities.Treasure;
import com.oop_pub.design_patterns.game.World;

import java.util.Observable;
import java.util.Observer;

public class WorldPrinter implements Observer {

    private int[][] map;

    @Override
    public void update(Observable o, Object arg) {
        World world = (World) o;

        // TODO nicer deep-copy
        this.map = new int[World.MAP_SIZE][World.MAP_SIZE];

        for (int i = 0; i < World.MAP_SIZE; i++)
            for (int j = 0; j < World.MAP_SIZE; j++)
                this.map[i][j] = world.getMap()[i][j];


        for (Hero h : world.getParty()) {
            this.map[h.getPosx()][h.getPosy()] = World.HERO_SPOT;
        }

        for (Treasure t : world.getTreasures()) {
            this.map[t.getPosx()][t.getPosy()] = World.TREASURE_SPOT;
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < World.MAP_SIZE; i++) {
            for (int j = 0; j < World.MAP_SIZE; j++) {

                if (map[i][j] == World.HERO_SPOT)
                    sb.append('H');
                else if (map[i][j] == World.TREASURE_SPOT)
                    sb.append('T');
                else sb.append(map[i][j]);
                for (int k = 0; k < 2; k++)
                    sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(new String(sb));
    }

}