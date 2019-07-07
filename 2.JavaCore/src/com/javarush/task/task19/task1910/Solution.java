package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name2));
        while(bufferedReader.ready()){
            String s = bufferedReader.readLine();
            bufferedWriter.write(s.replaceAll("[\\p{Punct}\\n]",""));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
