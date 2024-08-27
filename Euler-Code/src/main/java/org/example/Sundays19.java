package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;



public class Sundays19 {


    private static int sundayCounter = 0;

    public static void generateDates(){

        int i , j , k;
        k = 2000;
        i = 1;

        for( k = 1901 ; k < 2001 ; k++ ) {
            for (j = 1; j <= 12; j++) {

                LocalDate currDate = LocalDate.of(k, j, i);
                DayOfWeek dayOfWeek = currDate.getDayOfWeek();
                System.out.println(" Current Date is ::  " + currDate + " day of the week is  " + dayOfWeek);
                if(dayOfWeek.equals(DayOfWeek.SUNDAY))
                    sundayCounter+=1;


            }
        }

        System.out.println("Final count of total Sundays is :: " + sundayCounter);
    }
    public static void main(String[] args) {

        System.out.println("Hello world!!!! From Sundays");
        generateDates();
    }
}