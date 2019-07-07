package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        String buf;
        while ((buf = fileReader.readLine()) != null) {
            String[] strArray = buf.split(" ");
            for (int i = 0; i < strArray.length; i++) {
                try {
                    Integer.parseInt(strArray[i]);
                    fileWriter.write(strArray[i] + " ");
                }
                catch (NumberFormatException e) {}
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
