package com.dev.Codility;

import java.util.HashSet;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = new int[]{1, 3, 0, 6};
        System.out.println(solution(A));
    }

    static int solution(int[] A){
        int N = A.length;
        int checkSum = N * (N + 1) / 2;
        int i = 0;
        HashSet<Integer> checkedNumbers = new HashSet<>();
        boolean sequenceIsValid = true ;

        while (i < N && sequenceIsValid){
            Integer item = new Integer(A[i]);
            sequenceIsValid = checkedNumbers.add(item);
            if (item == 0) {sequenceIsValid = false;}
            checkSum = checkSum - item;
            i++;
        }

        int result = (checkSum == 0 && sequenceIsValid ) ? 1 : 0 ;
        return result;
    }
}
