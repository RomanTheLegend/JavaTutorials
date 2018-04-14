package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SmallestMissedIntegerTest {
    private int[] targetArray;
    private int expected;

    public SmallestMissedIntegerTest(int[] targetArray, int expected) {
        this.targetArray = targetArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection inputs(){
        Collection inputs = new ArrayList();
        inputs.add(new Object[]{ new int[]{1, 3, 6, 4, 1, 2},5});
        return inputs;
    }

    @Test
    public void solution() {
        int result = SmallestMissedInteger.solution( targetArray );
        assertEquals(expected, result);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}