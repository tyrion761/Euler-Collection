package org.example;

import java.util.Arrays;

public class FactorialTwenty20 {



    private static int[][] arrNum =  new int[1002][1002];


    private  static int[] mulitply(int[] prevArr,int multiplyFactor){

        int i;
        int carry = 0;
        int[] currArr = new int[1002];
        Arrays.fill(currArr,0);

        for ( i = prevArr.length -1 ; i >= 0 ; i-- ){
            currArr[i] = prevArr[i] * multiplyFactor + carry;
            carry = currArr[i] / 10;
            currArr[i] = currArr[i] % 10;
        }

        return  currArr;
    }

    public static void main(String[] args) {

        System.out.println("Hello world! From PowerDigit16 ");


        int i ;

        for( i = 0 ; i < 1002 ; i++ )
            Arrays.fill(arrNum[i],0);


        arrNum[0][1000] = 1;
        arrNum[1][1000] = 1;
        arrNum[2][1000] = 2;


        for ( i = 2 ;  i < 100 ; i++ ) {

            arrNum[i+1] = mulitply(arrNum[i],i+1);
           // Arrays.stream(arrNum[i+1]).forEach(System.out::print);
            System.out.println("  Sum is :: " + Arrays.stream(arrNum[i+1]).sum());

        }



    }
}