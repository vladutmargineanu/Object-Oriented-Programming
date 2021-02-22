package com.oop_pub.visitor.Implementations;

import com.oop_pub.visitor.Visitable;
import com.oop_pub.visitor.Visitor;

import java.util.LinkedList;

public class Boss extends Employee {
    protected float bonus;

    private LinkedList<Visitable> subordinates = new LinkedList<Visitable>();

    public Boss(String name, float salary, float bonus) {
        super(name, salary);

        this.bonus = bonus;
    }

    public Boss(String name, float salary, float extraHours, float bonus) {
        super(name, salary, extraHours);

        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public LinkedList<Visitable> getSubordinates() {
        return subordinates;
    }

    public void addSubordinate(Visitable subordinate) {
        this.subordinates.add(subordinate);
    }

    /*	Ex 1. The purpose of the task is just a reminder of what happens at
    runtime and what happens at compile time: If accept in Boss is not
    overridden then the element passed to the visit method is of type
    Employee not Boss. At compile-time, in accept method from Employee the
    type of the parameter of the v.visit() call is Employee, and since
    overloaded methods are decided at compile-time, the call will be
    visit(Employee).
     */
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
