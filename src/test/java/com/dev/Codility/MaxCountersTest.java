package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class MaxCountersTest {
    private int[] dataArray;
    private int N;
    private int[] expected;

    public MaxCountersTest(int[] dataArray, int N, int[] expected) {
        this.dataArray = dataArray;
        this.N = N;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        Collection inputs = new ArrayList();
        inputs.add(new Object[]{new int[]{3, 4, 4, 6, 1, 4, 4}, 5, new int[]{3,2,2,4,2}});
        return inputs;
    }

    @Test
    public void checkBasicSolution() {
        int[] result = MaxCounters.solution(N, dataArray);
        assertArrayEquals(expected,result);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}