package com.dev.Codility;

import java.util.BitSet;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution2(7));
    }


    static  int solution2(int N){

        int currentZeroCount=0;
        int maxZeroCount=0;
        boolean validSequence=false;

        while (N>0){

            int bit = N & 1;
            if (bit == 1){
                validSequence = true;
            }

            currentZeroCount = (bit == 0 && validSequence) ? currentZeroCount + 1 : 0;

            if (maxZeroCount < currentZeroCount) {
                maxZeroCount = currentZeroCount;
            }
            N = N >> 1;
        }
        return maxZeroCount;
    }
}
