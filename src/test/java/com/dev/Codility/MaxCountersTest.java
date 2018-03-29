package com.dev.Codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxCountersTest {

    @Test
    public void checkBasicSolution() {
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] expected = new int[]{3,2,2,4,2};

        int[] result = MaxCounters.solution(N, A);
        assertArrayEquals(expected,result);
        System.out.println("MaxCountersTest complete");
    }
}