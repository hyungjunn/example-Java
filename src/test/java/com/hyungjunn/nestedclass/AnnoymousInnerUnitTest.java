package com.hyungjunn.nestedclass;

import org.junit.jupiter.api.Test;

interface SimpleInterface {
    void run();
}

public class AnnoymousInnerUnitTest implements SimpleInterface {

    @Test
    @Override
    public void run() {
        SimpleInterface simpleInterface = new SimpleInterface() {
            @Override
            public void run() {
                System.out.println("Running Annoymous Class");
            }
        };

        simpleInterface.run();

    }

}
