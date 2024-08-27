package org.example;

import java.util.Arrays;

public class SumPowerDigit56 {



    private static int[][] arrNum =  new int[1002][1001];


    private  static int[] add(int[] prevArr,int multiplyFactor){

        int i;
        int carry = 0;
        int[] currArr = new int[1001];
        Arrays.fill(currArr,0);

        for ( i = prevArr.length -1 ; i >= 0 ; i-- ){
            currArr[i] = prevArr[i] * multiplyFactor + carry;
            carry = currArr[i] / 10;
            currArr[i] = currArr[i] % 10;
        }

        return  currArr;
    }

    public static void main(String[] args) {

        System.out.println("Hello world! From SumPowerDigit56 ");
        long[] ansMax = new  long[102];
        int j;
        Arrays.fill(ansMax,-1);

        long superMax = -1;

        for( j = 2 ; j <= 100 ; j++) {
            int i;

            for (i = 0; i < 1002; i++)
                Arrays.fill(arrNum[i], 0);


            arrNum[1][1000] = j;
            arrNum[2][1000] = j*j;

            long max = -1;
            long sum = 0;

            for (i = 3; i < 101; i++) {

                arrNum[i] = add(arrNum[i - 1],j);
                //Arrays.stream(arrNum[i]).forEach(System.out::print);
                sum = (long) Arrays.stream(arrNum[i]).sum();
                //System.out.println(j + "  power " + i + " === Digital Sum is :: " + sum);
                if (max <= sum)
                    max = sum;


            }
            ansMax[j] = max;
            if(superMax <= max)
                superMax = max;

        }
        System.out.println(" Maximum digital sum is  :: " + superMax);
    }
}