package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ArrayCyclicRotationTest {

    private int[] targetArray;
    private int[] expectedResult;
    private int stepsCount;

    public ArrayCyclicRotationTest(int[] targetArray, int[] expectedResult, int stepsCount) {
        this.targetArray = targetArray;
        this.expectedResult = expectedResult;
        this.stepsCount = stepsCount;
    }

    @Parameterized.Parameters
    public static Collection arraysData(){
        Collection<Object[]> inputs = new ArrayList<>();
        inputs.add(new Object[] { new int[] {4,5,6,7,8}, new int[] {4,5,6,7,8}, 5 });
        inputs.add(new Object[] { new int[] {}, new int[] {}, 5 });
        inputs.add(new Object[] { new int[] {0,1}, new int[] {1,0}, 5 });
        return inputs;
    }

    @Test
    public void checkArrayRotation() {
        int[] realResult = ArrayCyclicRotation.solution(targetArray, stepsCount);
        assertArrayEquals(realResult, expectedResult);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}