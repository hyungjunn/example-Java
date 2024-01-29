package com.hyungjunn.initializatioin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitializingFieldsTest {

    @Test
    void test() {
        //given && when
        new InitializingFields();
        new InitializingFields();

        //then
        Assertions.assertThat(InitializingFields.count).isEqualTo(8);
    }

}