package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        while (bufferedReader.ready()){
            String s = bufferedReader.readLine();
            String[] arr = s.split(" ");

            for (int i = 0; i < arr.length ; i++) {
                if(arr[i].matches(".*\\d.*")){
                    bufferedWriter.write(arr[i] + " ");
                }
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
