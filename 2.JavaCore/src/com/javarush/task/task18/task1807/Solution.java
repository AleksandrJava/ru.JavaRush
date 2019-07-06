package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream(new BufferedReader(
                new InputStreamReader(System.in)).readLine());
        int n = 0;
        while (inputStream.available() > 0){
            if (inputStream.read() == (byte)',') n++;
        }

        inputStream.close();

        System.out.println(n);
    }
}
