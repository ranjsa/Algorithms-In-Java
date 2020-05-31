package com.company.Algorithms;

public class PrimeFactorizationSieve {

    private int[] sieve() {
        int[] array = new int[1000001];
        int maxN = 1000000;
        for (int i =1; i <= maxN; i++) {
            array[i] = -1;
        }
        for (int i=2; i <= maxN; i++) {
            if (array[i] == -1) {
                for(int j = i; j <= maxN; j += i){
                    if (array[j] == -1) {
                        array[j] = i;
                    }
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {
        int n = 1729;
        PrimeFactorizationSieve pf = new PrimeFactorizationSieve();
        int[] array = pf.sieve();
        while (n > 1) {
            System.out.print(array[n] + " ");
            n = n / array[n];
        }
    }
}
