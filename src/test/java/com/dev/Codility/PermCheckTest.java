package com.dev.Codility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PermCheckTest {
    private int[] targetArray;
    private int expected;

    public PermCheckTest(int[] targetArray, int expected) {
        this.targetArray = targetArray;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection inputs(){
        Collection inputs = new ArrayList();
        inputs.add(new Object[]{ new int[]{1, 3, 0, 6}, 0});
        inputs.add(new Object[]{ new int[]{1, 3, 6, 5, 2, 4}, 1});
        return inputs;
    }

    @Test
    public void solution() {
        int result = PermCheck.solution( targetArray );
        assertEquals(expected, result);
        System.out.println(this.getClass().getSimpleName() + " completed");
    }
}
