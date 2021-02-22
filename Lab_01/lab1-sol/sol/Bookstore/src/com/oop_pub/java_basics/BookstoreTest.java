package com.oop_pub.java_basics;

import java.util.Scanner;

final class BookstoreTest {
    private BookstoreTest() {

    }

    static Book readBook() {
        Book b = new Book();
        Scanner s = new Scanner(System.in);

        System.out.print("Titlul cartii: ");
        b.setTitle(s.nextLine());

        System.out.print("Autorul cartii: ");
        b.setAuthor(s.nextLine());

        System.out.print("Editura cartii: ");
        b.setPublisher(s.nextLine());

        System.out.print("Numarul de pagini a cartii: ");
        b.setPageCount(Integer.parseInt(s.nextLine()));

        if (b.getPageCount() <= 0) {
            System.out.println("Numarul de pagini nu poate fi negativ sau zero!");
        }

        return b;
    }

    static void displayBook(final Book b) {
        String message = String.format(
                "\n BOOK_TITLE: %1$s \n BOOK_AUTHOR: %2$s \n BOOK_PUBLISHER: %3$s \n",
                b.getTitle().toUpperCase(),
                b.getAuthor(),
                b.getPublisher().toLowerCase()
        );

        System.out.print(message);
    }
}
