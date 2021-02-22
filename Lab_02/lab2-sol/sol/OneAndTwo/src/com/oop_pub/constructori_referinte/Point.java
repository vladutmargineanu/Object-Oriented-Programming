package com.oop_pub.constructori_referinte;

class Point {

    private float x, y;

    Point(final float xx, final float yy) {
        this.x = xx;
        this.y = yy;
    }

    void changeCoords(final float xx, final float yy) {
        this.x = xx;
        this.y = yy;
    }

    void printCoords() {
        System.out.println(String.format("%1$.2f, %2.2f", x, y));
    }

}
