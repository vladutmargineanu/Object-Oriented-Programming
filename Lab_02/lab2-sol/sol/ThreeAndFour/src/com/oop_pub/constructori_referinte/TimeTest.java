package com.oop_pub.constructori_referinte;

class TimeTest {

    private static final int SIZE = 1000000;

    void test1() {
        Integer[] x = new Integer[SIZE];

        for (int i = 0; i < SIZE; i++) {
            x[i] = new Integer(2 + 3);
        }
    }

    void test2() {
        Integer[] x = new Integer[SIZE];

        for (int i = 0; i < SIZE; i++) {
            x[i] = 2 + 3;
        }
    }

    void test3() {
        int[] x = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            x[i] = 2 + 3;
        }
    }
}
