package com.hellocorp.test.subject.test;

import com.hellocorp.test.subject.Subject4;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Subject4Test {

    Subject4 subject4 = new Subject4();

    @ParameterizedTest
    @CsvSource({
            "'2, 1, 3, 5', '5, 3, 1, 2'",
            "'1, 3, 5, 7, 9', '9, 7, 5, 3, 1'"
    })
    public void test_reverse(String nums, String expectedNums) {
        Subject4.Node node = Subject4.fromString(nums);
        subject4.reverse(node);

        String result = Subject4.toString(node);
        assertEquals(expectedNums, result);
    }
}