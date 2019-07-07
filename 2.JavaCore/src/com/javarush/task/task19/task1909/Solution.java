package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
            char c = (char)bufferedReader.read();
            if(c == '.'){
                bufferedWriter.write('!');
            } else {
                bufferedWriter.write(c);
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
