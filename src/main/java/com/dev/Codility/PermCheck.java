package com.dev.Codility;

import java.util.HashSet;

//A permutation is a sequence containing each element from 1 to N once, and only once.
//TASK: check if given array is permutation.

public class PermCheck {
    static int solution(int[] A){
        int N = A.length;
        int checkSum = N * (N + 1) / 2;
        int i = 0;
        HashSet<Integer> verifiedNumbers = new HashSet<>();
        boolean sequenceIsValid = true ;

        while (i < N && sequenceIsValid){
            Integer record = new Integer(A[i]);
            sequenceIsValid = verifiedNumbers.add(record);
            if (record == 0) {sequenceIsValid = false;}
            checkSum = checkSum - record;
            i++;
        }

        int result = (checkSum == 0 && sequenceIsValid ) ? 1 : 0 ;
        return result;
    }
}
