package com.javarush.task.task08.task0827;

import java.util.Date;


/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 21 1999"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11


        Date currentTime = new Date();
        String arr[] = date.split(" ");
        switch (arr[0]) {
            case("JANUARY"):
                currentTime.setMonth(0);
                break;
            case("FEBRUARY"):
                currentTime.setMonth(1);
                break;
            case("MARCH"):
                currentTime.setMonth(2);
                break;
            case("APRIL"):
                currentTime.setMonth(3);
                break;
            case ("MAY"):
                currentTime.setMonth(4);
                break;
            case ("JUNE"):
                currentTime.setMonth(5);
                break;
            case ("JULY"):
                currentTime.setMonth(6);
                break;
            case ("AUGUST"):
                currentTime.setMonth(7);
                break;
            case ("SEPTEMBER"):
                currentTime.setMonth(8);
                break;
            case ("OCTOBER"):
                currentTime.setMonth(9);
                break;
            case ("NOVEMBER"):
                currentTime.setMonth(10);
                break;
            case ("DECEMBER"):
                currentTime.setMonth(11);
                break;
        }
        int day = Integer.parseInt(arr[1]);
        currentTime.setDate(day);

        int year = Integer.parseInt(arr[2]);
        currentTime.setYear(year);

        yearStartTime.setYear(year);

        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней

        dayCount++;
        if(dayCount%2 == 1) {
            return true;
        } else return false;
    }
}
