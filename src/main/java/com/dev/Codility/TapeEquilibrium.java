package com.dev.Codility;

/**
 * Created by the.Legend on 21/03/2018.
 */
public class TapeEquilibrium {

    public static void main(String[] args){

        int[]  A = new int[] {3, 1, 2, 4, 3};

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        int minimalDifference;
        int sumLeft,sumRight=0;

        //A = new int[] {2,4,6,2,5,7,8,9,3,8};


        sumLeft = A[0];
        for (int i = 1; i < A.length - 1 ; i++){
            sumRight = sumRight + A[i];
        }

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
