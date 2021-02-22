package com.oop_pub.java_basics;

final class Main {

    private Main() {

    }

    public static void main(final String[] args) {
        Book a = BookstoreTest.readBook();
        Book b = BookstoreTest.readBook();

        BookstoreTest.displayBook(a);
        BookstoreTest.displayBook(b);

        String isCopyMessage = String.format("\n Este copie: %1$b \n", BookstoreCheck.isCopy(a, b));
        Book thickestBook = BookstoreCheck.getThickestBook(a, b);

        System.out.println(isCopyMessage);

        System.out.println("\n Cea mai groasa carte este :");

        BookstoreTest.displayBook(thickestBook);
    }
}
