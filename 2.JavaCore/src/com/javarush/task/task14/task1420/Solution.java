package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = scanner.nextInt();
        }
        if(arr[0] < 1 || arr[1] < 1) throw new Exception();
        int min = 0;
        int nod = 0;
        if(arr[0] < arr[1]) {
            min = arr[0];
        } else if(arr[0] > arr[1]){
            min = arr[1];
        } else nod = arr[0];
        if(nod == 0) {
            for (int i = 1; i <= min; i++) {
                if(arr[0]%i == 0 && arr[1]%i == 0 && i > nod){
                    nod = i;
                }
            }
        }
        System.out.println(nod);
    }
}
