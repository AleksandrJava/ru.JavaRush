package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(name1);
        FileWriter fileWriter = new FileWriter(name2);
        int count = 1;
        while(fileReader.ready()){
            int c = fileReader.read();
            if(count == 2){
                fileWriter.write(c);
                count = 1;
            } else {
                count = 2;
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
