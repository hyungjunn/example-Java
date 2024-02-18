package com.hyungjunn.annotation;

public class AnnotationTest {

    @NeedOptimization(reason = "성능 향상이 필요합니다")
    public static void processData() {
        System.out.println("annotation Test");
    }

    @LogMethod(entry = true, exit = true)
    public void someMethod() {

    }

    @ApiVerison("v2")
    public void value() {

    }
}
