package com.hyungjunn.nestedclass;

import org.junit.jupiter.api.Test;

public class NewEnclosing {

    int x = 1;

    void run() {

        int x = 2;
        class Local { // Local 클래스는 modifier를 쓸 수 없다

            int x = 3;
            void run() {
                // method implementation
                System.out.println(x);
            }
        }

        Local local = new Local();
        local.run();
    }

    @Test
    void test() {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}

