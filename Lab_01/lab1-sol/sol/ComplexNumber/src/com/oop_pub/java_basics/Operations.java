package com.oop_pub.java_basics;

final class Operations {
    private Operations() {
    }

    static ComplexNumber add(final ComplexNumber a, final ComplexNumber b) {
        ComplexNumber c = new ComplexNumber();

        c.setRe(a.getRe() + b.getRe());
        c.setIm(a.getIm() + b.getIm());

        return c;
    }

    static ComplexNumber multiply(final ComplexNumber a, final ComplexNumber b) {
        ComplexNumber c = new ComplexNumber();

        c.setRe(a.getRe() * b.getRe() - a.getIm() * b.getIm());
        c.setIm(a.getRe() * b.getIm() + a.getIm() * b.getRe());

        return c;
    }
}
