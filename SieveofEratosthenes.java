//remove the package name
package com.company.Algorithms;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n = 1000000;
        long[] primeNumbers  = new long[1000005];
        primeGenerator(primeNumbers);
        for(int i =0; i <= n; i++) {
            if (primeNumbers[i] == 1) {
                System.out.println(i);
            }
        }
    }
    private static void primeGenerator(long[] primeNumbers) {
        for (int i=3; i <= 1000000; i += 2) {
            primeNumbers[i] = 1;
        }
        for (long i = 3;  i<= 1000000; i+=2) {
            if(primeNumbers[(int)i] == 1) {
                for(long j = i * i; j <= 1000000; j = j + i) {
                    primeNumbers[(int)j] = 0;
                }
            }
        }
        primeNumbers[2] = 1;
        primeNumbers[0] = 0;
        primeNumbers[1] = 0;
    }
}