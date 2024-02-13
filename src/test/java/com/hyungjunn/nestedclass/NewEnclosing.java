package com.hyungjunn.nestedclass;

import org.junit.jupiter.api.Test;

public class NewEnclosing {

    static int x = 1;

    void run() {

        //int x = 2;
        // Local 클래스는 modifier를 쓸 수 없다 왜???
        // 매우 제한된 scope 이어야 하기 때문에 Local class는 modifier를 붙히지 않는다
        class Local {

            static int y = 4;

            //int x = 3;
            void run() {
                // method implementation
                System.out.println("x: " + x);
                System.out.println("y: " + y);
            }
        }

//        Local local = new Local();
//        local.run();
        System.out.println(Local.y);
    }

    @Test
    void test() {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}

