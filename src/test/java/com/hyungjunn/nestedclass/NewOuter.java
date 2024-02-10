package com.hyungjunn.nestedclass;

import org.junit.jupiter.api.Test;

public class NewOuter {

    int a = 10;
    static int b = 20;

    public class InnerClass {

        int a = 1_000_000_000;
        static int b = 2_000_000_000;

        private void run() {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("NewOuter.this.a = " + NewOuter.this.a);
            System.out.println("NewOuter.b = " + NewOuter.b);
            System.out.println("NewOuter.this.b = " + NewOuter.this.b);
        }

    }

    @Test
    void test() {
        NewOuter newOuter = new NewOuter();
        InnerClass innerClass = newOuter.new InnerClass();
        innerClass.run();
    }
}
