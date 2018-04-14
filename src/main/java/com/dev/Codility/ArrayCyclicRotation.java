package com.dev.Codility;

public class ArrayCyclicRotation {
    static int[] solution(int[] A, int K) {
        if (A.length>0) {
            if (K > 1) {
                K--;
                A = solution(A, K);
            }
            int lastItem = A[A.length - 1];
            for (int i = A.length - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = lastItem;
        }
        return A;
    }
}