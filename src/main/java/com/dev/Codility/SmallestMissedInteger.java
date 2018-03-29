package com.dev.Codility;

import java.util.HashSet;

public class SmallestMissedInteger {
    public static void main(String[] args) {
        // write your code here

        int[] A = new int[]{1, 3, 6, 4, 1, 2};


        System.out.println(solution(A));
    }

    static int solution(int[] A){
        HashSet<Integer> existingNumbers = new HashSet<>();
        int smallestInt = 1;

        for (int i = 0; i < A.length ; i++ ){
            Integer item = new Integer(A[i]);
            if(item > 0){
                existingNumbers.add(item);
                if ( smallestInt == item ){
                    smallestInt = getNextFreeInt(existingNumbers, smallestInt);
                }
            }
        }
        return smallestInt;
    }

    static int getNextFreeInt(HashSet<Integer> existingNumbers, int startNumber){
        Integer smallestInt = new Integer(startNumber);
        while(existingNumbers.contains(smallestInt)){
            smallestInt++;
        }
        return smallestInt;
    }

}
