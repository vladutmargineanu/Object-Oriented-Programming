package com.oop_pub.constructori_referinte;

final class Tester {

    private Tester() {

    }

    public static void main(final String[] args) {
        TimeTest timeTest = new TimeTest();
        MemoryTest memoryTest = new MemoryTest();

        long start, end;

        // test Integer x = new Integer(2 + 3);
        start = System.nanoTime();
        timeTest.test1();
        end = System.nanoTime();

        System.out.println(String.format(
                "Time Integer x = new Integer(2 + 3): %1$d ns",
                (end - start)));

        // test Integer x = 2 + 3;
        start = System.nanoTime();
        timeTest.test2();
        end = System.nanoTime();

        System.out.println(String.format(
                "Time Integer x = 2 + 3: %1$d ns",
                (end - start)));

        // test int x = 2 + 3;
        start = System.nanoTime();
        timeTest.test3();
        end = System.nanoTime();

        System.out.println(String.format(
                "Time int x = 2 + 3: %1$d ns",
                (end - start)));

        // test String s = new String("abc");
        memoryTest.test1();

        // test String s = "abc";
        memoryTest.test2();
    }
}
