package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.game.GameState;
import com.oop_pub.design_patterns2.strategies.Strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {

    protected String name;
    protected List<Treasure> inventory;
    protected int posx, posy;
    protected int hp;
    protected Strategy strategy;
    protected Monster target;


    /* Hero actions */
    public void move(Direction direction) {

        GameState gs = GameState.getInstance();
        setTarget(null);

        if (direction == Direction.E)
            posy = (posy + 1) % GameState.MAP_SIZE;
        if (direction == Direction.W)
            posy = (posy + GameState.MAP_SIZE - 1) % GameState.MAP_SIZE;
        if (direction == Direction.S)
            posx = (posx + 1) % GameState.MAP_SIZE;
        if (direction == Direction.N)
            posx = (posx + GameState.MAP_SIZE - 1) % GameState.MAP_SIZE;

        gs.update();
    }

    public void collect(Treasure treasure) {

        // "removing the treasure from the map...ugly hack"
        treasure.setPosx(-1);
        treasure.setPosy(-1);

        if (inventory == null)
            inventory = new ArrayList<>();

        // this hero now has the treasure
        inventory.add(treasure);

    }

    public abstract void attack();

    /* Getters and setters */
    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Treasure> getInventory() {
        return inventory;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public int getHP() {
        return this.hp;
    }

    public void setTarget(Monster m) {
        this.target = m;
    }

    public Monster getTarget() {
        return target;
    }

    public boolean canAttack() {
        return this.target != null;
    }

    public enum HeroType {
        WARRIOR, MAGE, PRIEST
    }

    public enum Direction {
        S, N, E, W//, NV, NE, SE, SV
    }
}
