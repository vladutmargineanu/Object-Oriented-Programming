package com.oop_pub.constructori_referinte;

final class Polygon {

    private Point[] points;

    private Polygon(final int n) {
        points = new Point[n];
    }

    private Polygon(final float[] p) {
        this(p.length / 2);

        int j = 0;

        for (int i = 0; i < points.length; i += 2) {
            this.points[j++] = new Point(p[i], p[i + 1]);
        }
    }

    public static void main(final String[] args) {
        float[] points = {2, 3, 4, 0, -1, 6};

        Polygon poly = new Polygon(points);

        for (int i = 0; i < poly.points.length; i++) {
            poly.points[i].printCoords();
        }
    }

}

