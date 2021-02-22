package com.oop_pub.java_basics;

final class TestOperations {
    private TestOperations() {
    }

    private static ComplexNumber getNumber(final float re, final float im) {
        ComplexNumber c = new ComplexNumber();

        c.setRe(re);
        c.setIm(im);

        return c;
    }

    static String testAddOperation() {
        ComplexNumber a = getNumber(3, 5);
        ComplexNumber b = getNumber(4, 6);

        ComplexNumber c = Operations.add(a, b);

        return String.format("%1$.2f + %2$.2f  * i", c.getRe(), c.getIm());
    }

    static String testMultiplyOperation() {
        ComplexNumber a = getNumber(5, 7);
        ComplexNumber b = getNumber(6, 8);

        ComplexNumber c = Operations.multiply(a, b);

        return String.format("%1$.2f + %2$.2f  * i", c.getRe(), c.getIm());
    }
}
