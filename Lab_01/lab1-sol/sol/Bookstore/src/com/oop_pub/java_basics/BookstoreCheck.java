package com.oop_pub.java_basics;

final class BookstoreCheck {
    private BookstoreCheck() {

    }

    static Boolean isCopy(final Book a, final Book b) {
        if (!a.getTitle().equals(b.getTitle())) {
            return false;
        }

        if (!a.getAuthor().equals(b.getAuthor())) {
            return false;
        }

        if (!a.getPublisher().equals(b.getPublisher())) {
            return false;
        }

        if (a.getPageCount() != b.getPageCount()) {
            return false;
        }

        return true;
    }

    static Book getThickestBook(final Book a, final Book b) {
        if (a.getPageCount() > b.getPageCount()) {
            return a;
        }

        return b;
    }
}
