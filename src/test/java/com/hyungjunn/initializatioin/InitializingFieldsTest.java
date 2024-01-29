package com.hyungjunn.initializatioin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InitializingFieldsTest {

    @Test
    void test() {
        //given && when
        new InitializingFields();
        System.out.println("-------------------------------");
        new InitializingFields();

        //then
        Assertions.assertThat(InitializingFields.count).isEqualTo(10);
    }

}