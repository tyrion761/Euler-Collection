package org.example;

import java.util.Arrays;

public class Eulerone {

    private static int limit = 1000;
    private static int lowerLimit = 0;

    private static long sum = 0;

    private static int threeApArray [] = new int[334];

    private static int fiveApArray [] = new int[200];

    private static int fifteenApArray [] = new int[67];

    public static void main(String[] args) {
        long initTime = System.currentTimeMillis();
        System.out.println("Welcome to Euler one !!! First Problem !!!");

        //initializing  sequenece of 3 AP
        Arrays.setAll(threeApArray , i -> i*3);

        //initializing  sequenece of 5 AP
        Arrays.setAll( fiveApArray, i -> i*5  );

        //initializing  sequenece of 15 AP
        Arrays.setAll( fifteenApArray, i -> i*15  );



        System.out.println("print all numbers incremented by 3 ");
        Arrays.stream(threeApArray)
                .mapToObj(i -> Integer.toString(i) + " ")
                .forEach(System.out::print);

        System.out.println("  ");

        System.out.println("print all numbers incremented by 5");
        Arrays.stream(fiveApArray)
                .mapToObj(i -> Integer.toString(i) + " ")
                .forEach(System.out::print);
        System.out.println("  ");

        System.out.println("print all numbers incremented by 15 ");
        Arrays.stream(fifteenApArray)
                .mapToObj(i -> Integer.toString(i) + " ")
                .forEach(System.out::print);
        System.out.println("  ");

        System.out.println(Arrays.stream(threeApArray).sum() + Arrays.stream(fiveApArray).sum()  - Arrays.stream(fifteenApArray).sum());

        long finishTime = System.currentTimeMillis();

        System.out.println(" Time taken to run this code " + (finishTime - initTime) + " milliseconds");
    }
}
