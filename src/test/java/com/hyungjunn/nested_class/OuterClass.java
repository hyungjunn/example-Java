package com.hyungjunn.nested_class;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OuterClass {

    private int x = 1;

    private class InnerClass {

        private int run() {
            return x + 1;
        }

    }

    @Test
    void test() {
        InnerClass innerClass = new InnerClass();
        Assertions.assertThat(innerClass.run()).isEqualTo(2);
    }

    @Test
    void test_instantiation() {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        Assertions.assertThat(innerClass.run()).isEqualTo(2);
    }

}
