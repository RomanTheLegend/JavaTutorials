package com.dev.Codility;


// Array A represents numbers on a tape.
// Any integer P, such that 0 < P < N, splits this tape into two non-empty parts:
// A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
// The difference between the two parts is the value of:
// |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
// In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
// TASK: find the minimal difference that can be achieved.

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int minimalDifference;
        int sumLeft,sumRight=0;

        sumLeft = A[0];
        for (int i = 1; i < A.length ; i++)  sumRight = sumRight + A[i];

        minimalDifference = Math.abs( sumLeft - sumRight );
        for (int i = 1; i < A.length - 2 ; i++){
            sumLeft = sumLeft + A[i];
            sumRight = sumRight - A[i];
            int diff = Math.abs( sumLeft - sumRight );
            if (minimalDifference > diff) {
                minimalDifference = diff;
            }
        }
        return minimalDifference;
    }
}
