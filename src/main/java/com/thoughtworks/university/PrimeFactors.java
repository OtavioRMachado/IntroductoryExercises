package com.thoughtworks.university;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static final int FIRST_PRIME_NUMBER = 2;

    public static List<Integer> generate(int value) {
        List<Integer> primeList = new ArrayList<Integer>();
        int divisor = FIRST_PRIME_NUMBER;
        while(value > 1) {
            if(value % divisor == 0) {
                value = value / divisor;
                primeList.add(divisor);
            } else {
                divisor = getNextNumber(divisor);
            }
        }
        return primeList;
    }

    private static int getNextNumber(int lastPrime) {
        return lastPrime+1;
    }
}
