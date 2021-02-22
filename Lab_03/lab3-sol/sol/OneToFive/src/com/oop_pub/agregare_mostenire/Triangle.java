package com.oop_pub.agregare_mostenire;

public class Triangle extends Form {
    private float height;
    private float base;

    public Triangle() {
        height = 0;
        base = 0;
    }

    Triangle(final String c, final float h, final float b) {
        super(c);
        this.height = h;
        this.base = b;
    }

    @Override
    final float getArea() {
        return height * base / 2;
    }

    @Override
    public final String toString() {
        return String.format("Triangle: %1$s %2$s", super.toString(), getArea());
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public final boolean equals(final Object obj) {
        if (!(obj instanceof Triangle)) {
            return false;
        }

        Triangle t = (Triangle) obj;

        if (!this.color.equals(t.color)) {
            return false;
        }

        if (this.height != t.height) {
            return false;
        }

        if (this.base != t.base) {
            return false;
        }

        return true;
    }

    final void printTriangleDimensions() {
        System.out.println(String.format("%1$s %2$s", base, height));
    }
}
