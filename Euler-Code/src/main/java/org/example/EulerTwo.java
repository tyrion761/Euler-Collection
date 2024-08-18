package org.example;

import java.util.Arrays;

public class EulerTwo {

    private static long fibArr[] = new long[34];

    public static void main(String[] args) {

        //Arrays.fill(fibArr,0);

        fibArr[0] = (long)0;
        fibArr[1] = (long)1;

        Arrays.setAll(fibArr, i -> i >= 2 ? fibArr[i-1]+fibArr[i-2] : fibArr[i]);

        Arrays.stream(fibArr).mapToObj(i -> Long.toString(i) + " ").forEach(System.out::print);

        System.out.println(" blank line");

        Arrays.stream(fibArr).filter(i-> (i % 2 == 0)).mapToObj(i -> Long.toString(i) + " ").forEach(System.out::print);

        System.out.println(" Answer is :: " + Arrays.stream(fibArr).filter(i-> (i % 2 == 0)).sum()) ;





    }
}
