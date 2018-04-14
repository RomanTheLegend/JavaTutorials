package com.dev.Codility;

import java.util.HashSet;

public class FrogRiverOne {
    static int solution(int X, int[] A){
        int controlSum = X * (X + 1) / 2;
        int time = -1;
        int i = 0;
        HashSet<Integer> fallenLeaves = new HashSet<>();

        while (i < A.length && time < 0 ) {
            Integer item = new Integer(A[i]);
            if (fallenLeaves.add(item)) controlSum = controlSum - A[i];
            if (controlSum == 0 ) time = i;
            i++;
        }
        return time;
    }
}
