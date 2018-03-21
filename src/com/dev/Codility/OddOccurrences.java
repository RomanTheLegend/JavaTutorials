package com.dev.Codility;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by the.Legend on 21/03/2018.
 */
public class OddOccurrences {

    public static void main(String[] args){

        int[]  A = new int[] {2,4,7,5,4,2,5,3,3};

        System.out.println(soultion(A));
    }

    static int soultion(int[] A){
        HashSet<Integer> locatedNumbers=new HashSet<>();
        for ( int i = 0 ; i < A.length ; i++){
            Integer currentNumber = new Integer(A[i]);
            if (locatedNumbers.contains(currentNumber)){
                locatedNumbers.remove(currentNumber);
            }
            else {
                locatedNumbers.add(currentNumber);
            }
            currentNumber = null;
        }

        int result=0;
        Iterator<Integer> iterator = locatedNumbers.iterator();
        while (iterator.hasNext()){
             result = iterator.next();
        }
        return result;
    }
}
