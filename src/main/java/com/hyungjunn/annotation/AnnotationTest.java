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

@ClassPreamble(
        author = "제임스 고슬링",
        date = "02/10/2024",
        currentRevision = 1,
        lastModified = "02/19/2024",
        lastModifiedBy = "조슈아 블로크",
        reviewers = {"빌조이", "브라이언 고츠", "아서 반 호프"}
)
class GenerateCode {

}
