package com.hyungjunn.nested_class;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Enclosing {

    private static int x = 1;

    public static class StaticNested {

        private int run() {
            // method implementation
            return x + 1;
        }

    }

    @Test
    void test() {
        Enclosing.StaticNested staticNested = new Enclosing.StaticNested();
        Assertions.assertThat(staticNested.run()).isEqualTo(2);
    }

}


