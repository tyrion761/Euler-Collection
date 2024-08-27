package org.example;

import java.util.Arrays;

public class Fibonacci25 {



    private static int[][] arrNum =  new int[4902][1000];


    private  static int[] fib(int[] prevArr,int [] arr){

        int i;
        int carry = 0;
        int[] currArr = new int[1000];
        Arrays.fill(currArr,0);

        for ( i = prevArr.length - 1 ; i >= 0 ; i-- ){
            currArr[i] = prevArr[i] + arr[i] + carry;
            carry = currArr[i] / 10;
            currArr[i] = currArr[i] % 10;
        }

        return  currArr;
    }

    public static void main(String[] args) {

        System.out.println("Hello world! From PowerDigit16 ");


        int i ;

        for( i = 0 ; i < 4902 ; i++ )
            Arrays.fill(arrNum[i],0);



        arrNum[0][999] = 0;
        arrNum[1][999] = 1;
        arrNum[2][999] = 1;


        for ( i = 3 ;  i < 4901 ; i++ ) {

            arrNum[i] = fib(arrNum[i-1],arrNum[i-2]);
        }
        System.out.println(Arrays.stream(arrNum[4781]).count());
        Arrays.stream(arrNum[4781]).forEach(System.out::print);
        System.out.println("------------------------------------");
        System.out.println(Arrays.stream(arrNum[4782]).count());
        Arrays.stream(arrNum[4782]).forEach(System.out::print);


    }
}