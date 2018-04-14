package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TapeEquilibriumTest {
    private int[] tapeData;
    private int expectedResult;

    public TapeEquilibriumTest(int[] tapeData, int expectedResult) {
        this.tapeData = tapeData;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection inputs(){
        Collection inputs = new ArrayList();
        inputs.add(new Object[]{new int[] {3, 1, 2, 4, 3}, 1});
        inputs.add(new Object[]{new int[] {2, 4, 6, 2, 5, 7, 8, 9, 3, 8}, 2});
        return inputs;
    }

    @Test
    public void solution() {
        int minDifference = TapeEquilibrium.solution(tapeData);
        assertEquals(expectedResult,minDifference);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}