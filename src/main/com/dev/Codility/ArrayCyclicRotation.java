package com.dev.Codility;

/**
 * Created by the.Legend on 21/03/2018.
 */
public class ArrayCyclicRotation {
    public static void main(String[] args) {

        int[] A1 =  new int[] {4,5,6,7,8};
        int[] A2 =  new int[] {0,1};
        int[] A3 =  new int[] {};

        int[] B = solution(A1, 5);

        System.out.println("Done");

    }



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