package com.hyungjunn.nestedclass.anonymous;

public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    private String description() {
        return "Title: " + title;
    }

}
