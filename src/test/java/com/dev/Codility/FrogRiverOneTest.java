package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FrogRiverOneTest {
    private int[] targetArray;
    private int riverLength;
    private int expectedTime;

    public FrogRiverOneTest(int[] targetArray, int riverLength, int expectedTime) {
        this.targetArray = targetArray;
        this.riverLength = riverLength;
        this.expectedTime = expectedTime;
    }

    @Parameterized.Parameters
    public static Collection inputs(){
        Collection inputs = new ArrayList();
        inputs.add(new Object[]{ new int[]{1}, 1 , 0});
        inputs.add(new Object[]{ new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 5, 6});
        return inputs;
    }

    @Test
    public void solution() {
        int result = FrogRiverOne.solution( riverLength, targetArray );
        assertEquals(expectedTime, result);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}