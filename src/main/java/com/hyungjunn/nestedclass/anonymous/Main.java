package com.hyungjunn.nestedclass.anonymous;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<Runnable> actions = new ArrayList<>(2);

        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable.");
            }
        };
        actions.add(action);

        Book book = new Book("How to Java Champion?") {
            @Override
            public String description() {
                return "Learn about getting Java Champion";
            }
        };

        System.out.println(String.format("Title: %s, Description: %s", book.getTitle(), book.description()));

        actions.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from runnable #2.");
            }
        });

        int count = 1;

        Runnable action2 = new Runnable() {
            static final int x = 0;

            @Override
            public void run() {
                System.out.println(String.format("Runnable with captured variables: count = %s, x = %s", count, x));
            }
        };
        actions.add(action2);

        for (Runnable a : actions) {
            a.run();
        }

    }

}
