package com.dev.Codility;

public class BinaryGap {

    static  int solution( int N ){
        int currentZeroCount = 0;
        int maxZeroCount = 0;
        boolean sequenceIsValid = false;

        while ( N > 0 ){
            int currentBitValue = N & 1;
            if ( currentBitValue == 1 ) sequenceIsValid = true;
            currentZeroCount = ( currentBitValue == 0 && sequenceIsValid ) ? currentZeroCount + 1 : 0;
            if ( maxZeroCount < currentZeroCount ) maxZeroCount = currentZeroCount;
            N = N >> 1;
        }
        return maxZeroCount;
    }
}
