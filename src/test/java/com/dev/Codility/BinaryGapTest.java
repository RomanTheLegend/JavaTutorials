package com.dev.Codility;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryGapTest {
    private int inputNumber;
    private int expectedResult;

    public BinaryGapTest(Integer inputNumber, int expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection testNumbers() {
        return Arrays.asList(new Object[][] {
                { 352, 1 },
                { 4432, 3 },
                { 96, 0 },
                { 529, 4 },
                { 65, 5 }
        });
    }

    @Test
    public void checkBasicSolution() {
        int result = BinaryGap.solution(inputNumber);
        assertEquals(result,expectedResult);
        System.out.println("BinaryGapTest complete");
    }
}