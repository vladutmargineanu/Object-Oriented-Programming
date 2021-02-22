package com.oop_pub.design_patterns2.commands;

import com.oop_pub.design_patterns2.entities.Hero;

public class MoveCommand implements Command {

    private Hero hero;
    private Hero.Direction direction;

    public MoveCommand(Hero h, Hero.Direction d) {
        this.hero = h;
        this.direction = d;
    }

    public void undo() {
        Hero.Direction op = getOppositeDirection(direction);
        hero.move(op);
    }

    public void execute() {
        hero.move(direction);
    }

    public Hero.Direction getOppositeDirection(Hero.Direction d) {
        Hero.Direction op = null;
        switch (d) {
            case S:
                op = Hero.Direction.N;
                break;
            case N:
                op = Hero.Direction.S;
                break;
            case E:
                op = Hero.Direction.W;
                break;
            case W:
                op = Hero.Direction.E;
                break;
            default:
                break;
        }

        return op;

    }
}
