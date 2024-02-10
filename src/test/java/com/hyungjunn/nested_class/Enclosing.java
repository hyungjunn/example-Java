package com.hyungjunn.nested_class;

import org.junit.jupiter.api.Test;

public class Enclosing {

    private static int x = 1;

    public static class StaticNested {

        private void run() {
            // method implementation
        }

    }

    @Test
    void test() {

        Enclosing.StaticNested staticNested = new Enclosing.StaticNested();
        staticNested.run();
    }

}


