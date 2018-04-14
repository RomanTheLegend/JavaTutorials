package com.dev.Codility;

public class MaxCounters {
    static int[] solution(int N,int[] A){
        int[] counters = new int[N];
        int maxValue=0;
        boolean counterChanged=false;

        for (int i = 0; i < A.length ; i++){
            if (A[i] <= N ){
                int pos = A[i] - 1;
                counters[pos]++;
                counterChanged=true;
                if(counters[pos] > maxValue) maxValue = counters[pos];
            }
            if (A[i] == N+1 && counterChanged){
                for (int j = 1; j < N; j += j) {
                    counters[0]=maxValue;
                    System.arraycopy(counters, 0, counters, j, ((N - j) < j) ? (N - j) : j);
                }
                counterChanged = false;
            }
        }
        return counters;
    }
}
