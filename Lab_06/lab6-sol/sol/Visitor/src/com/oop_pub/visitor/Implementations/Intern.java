package com.oop_pub.visitor.Implementations;

import com.oop_pub.visitor.Visitable;
import com.oop_pub.visitor.Visitor;

public class Intern implements Visitable {

    private String name;
    private int duration;  // in months

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Intern(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
