package com.oop_pub.agregare_mostenire;

class Circle extends Form {
    private float radius;

    Circle() {
        radius = 0;
    }

    Circle(final String color, final float r) {
        super(color);
        this.radius = r;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return String.format("Cerc: %1$s %2$.2f", super.toString(), getArea());
    }

    void printCircleDimensions() {
        System.out.println(radius);
    }
}
