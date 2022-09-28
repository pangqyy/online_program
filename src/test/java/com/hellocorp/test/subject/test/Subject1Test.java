package com.hellocorp.test.subject.test;

import com.hellocorp.test.subject.Subject1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Subject1Test {

    Subject1 subject1 = new Subject1();

    @ParameterizedTest
    @CsvSource({
            "'8, 2, 3, 1, 4, 7, 3', 3, 14",
            "'7, 2, 3, 1, 5', 4, 13"
    })
    public void test_maxSum1(String nums, int n, int expectedResult) {
        int result = subject1.maxSum(nums, n);
        assertEquals(expectedResult, result);
    }
}
