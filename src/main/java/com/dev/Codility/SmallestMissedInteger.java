package com.dev.Codility;

import java.util.HashSet;

public class SmallestMissedInteger {

    static int solution(int[] A){
        HashSet<Integer> existingNumbers = new HashSet<>();
        int smallestInt = 1;

        for (int i = 0; i < A.length ; i++ ){
            Integer record = new Integer(A[i]);
            if(record > 0){
                existingNumbers.add(record);
                if ( smallestInt == record ){
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
