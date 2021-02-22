package com.oop_pub.agregare_mostenire;

class Form {
    protected String color;

    Form() {
        color = "none";
    }

    Form(final String c) {
        this.color = c;
    }

    float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return color;
    }
}
