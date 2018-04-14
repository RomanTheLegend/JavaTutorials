package com.dev.Codility;

import java.util.HashSet;
import java.util.Iterator;

//A non-empty zero-indexed array A consisting of N integers is given.
//The array contains an odd number of elements, and each element of the array can be paired
//with another element that has the same value, except for one element that is left unpaired.
//Task: find that element

public class OddOccurrences {
    static int solution(int[] A){
        HashSet<Integer> uniqueNumbersFromArray = new HashSet<>();

        for ( int i = 0 ; i < A.length ; i++){
            Integer currentNumber = new Integer(A[i]);
            if (!uniqueNumbersFromArray.add(currentNumber)) uniqueNumbersFromArray.remove(currentNumber);
            currentNumber = null;
        }

        int result=0;
        Iterator<Integer> iterator = uniqueNumbersFromArray.iterator();
        while (iterator.hasNext()){
             result = iterator.next();
        }
        return result;
    }
}
