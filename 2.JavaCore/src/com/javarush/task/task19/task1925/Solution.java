package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        StringBuffer out = new StringBuffer();
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 6) {
                    out.append(word).append(",");
                }
            }
        }

        out.delete(out.length()-1,out.length());
        fileWriter.write(out.toString());
        fileWriter.close();
        fileReader.close();
    }
}
