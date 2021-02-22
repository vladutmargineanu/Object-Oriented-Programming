package com.oop_pub.constructori_referinte;

class MemoryTest {

    private static final int SIZE = 10000000;

    void test1() {
        String[] x = new String[SIZE];

        for (int i = 0; i < SIZE; i++) {
            x[i] = new String("abc");
        }

        showUsedMemory("String s = new String(\"abc\")");
    }

    void test2() {
        String[] x = new String[SIZE];

        for (int i = 0; i < SIZE; i++) {
            x[i] = "abc";
        }

        showUsedMemory("String s = \"abc\"");
    }

    private void showUsedMemory(final String useCase) {
        long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println(String.format(
                "Memory used %1$s: %2$d bytes",
                useCase, usedMem));
    }
}
