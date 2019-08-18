package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;

/*
Алгоритмы-числа
*/

public class Solution {

    public static void main(String[] args){
        long N = 90000000;
        long startTime = System.currentTimeMillis();
        long startTime2 = System.nanoTime();
        long[] res = getNumbers(N);
        for (long a: res) {
            System.out.println(a);
        }
        System.out.println(((System.currentTimeMillis() - startTime) / 1000)+" секунд");
        System.out.println((System.nanoTime() - startTime2)+" наносекунд");

    }
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> list = new ArrayList<>();
        long[] allNumbers = new long[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084,
                548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208,
                472335975, 534494836, 912985153, 4679307774L, 32164049650L, 32164049651L, 40028394225L,
                42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L,
                1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L
        };

        for (long numb: allNumbers) {
            if(numb < N){
                list.add(numb);
            }
        }

        result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }



//    static double[][] tableFast;
//
//    public static long[] getNumbers(long N) {
//        long[] result = null;
//        tableFast = getTableFast(N);
//        ArrayList<Long> tempArr = new ArrayList<>();
//
//        if(N <= 10 ){
//            for (long i = 1; i < N ; i++) {
//                tempArr.add(i);
//            }
//        } else {
//            for (long i = 1; i <= 9 ; i++){
//                tempArr.add(i);
//            }
//
//            for (long i = 10; i < N; i++){
//                if (checkIncrease(i)) {
//                    long iSum = getSum(i);
//                    if (iSum > i && iSum <= N && isArmstrongDigital(iSum)){
//                        if (!tempArr.contains(iSum)) {
//                            tempArr.add(iSum);
//                        }
//                    }
//                }
//            }
//        }
//
//        result = new long[tempArr.size()];
//
//        for (int j = 0; j < tempArr.size(); j++){
//            result[j] = tempArr.get(j);
//        }
//
//        Arrays.sort(result);
//        return result;
//    }
//
//
//    public static int amountOfDigit(long N) {
//        int amountOfDigit = 0;
//        while(N > 0){
//            N = N / 10;
//            amountOfDigit++;
//        }
//
//        return amountOfDigit;
//    }
//
//
//    public static boolean checkIncrease(long x) {
//        int length = amountOfDigit(x);
//        for (int i = 1; i < length; i++) {
//            int digit1 = (int) (x % 10);
//            x = x / 10;
//            int digit0 = (int) (x % 10);
//            if (digit0 > digit1 && digit1 != 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    public static long getSum(long i) {
//        int digits = amountOfDigit(i);
//        long sum = 0;
//
//        for (int j = 0; j < digits; j++) {
//            int tempDigit = (int) (i % 10);
//            sum = sum + (long)tableFast[tempDigit][digits];
//            i = i / 10;
//        }
//        return sum;
//    }
//
//
//    public static boolean isArmstrongDigital(long i) {
//        int digits = amountOfDigit(i);
//        int[] arr = new int[digits];
//        long tempI = i;
//
//        for (int j = 0; j < digits; j++) {
//            arr[j] = (int) tempI % 10;
//            tempI = tempI / 10;
//        }
//        long sum = 0;
//        for (int j = 0; j < digits; j++) {
//            sum += tableFast[arr[j]][digits];
//        }
//        if (sum == i) {
//            return true;
//        }
//        return false;
//    }
//
//
//    public static double[][] getTableFast(long N) {
//        int digits = amountOfDigit(N);
//        tableFast = new double[10][digits+1];
//        for(int i = 0; i <= digits; i++){
//            for (int j = 0; j < 10; j++){
//                tableFast[j][i] = Math.pow(j, i);
//            }
//        }
//        return tableFast;
//    }


}