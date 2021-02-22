package com.oop_pub.java_basics;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String t) {
        this.title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String a) {
        this.author = a;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(final String p) {
        this.publisher = p;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(final int p) {
        this.pageCount = p;
    }
}
