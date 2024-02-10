package com.hyungjunn.nestedclass;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Enclosing {

    private static int x = 1;
    private int y;

    public static class StaticNested {

        private int run() {
            // method implementation
            // y = 4; // static-nested class don't access non-static "y"
            return x + 1;
        }

    }

    @Test
    void test() {
        Enclosing.StaticNested staticNested = new Enclosing.StaticNested();
        Assertions.assertThat(staticNested.run()).isEqualTo(2);
    }

}


