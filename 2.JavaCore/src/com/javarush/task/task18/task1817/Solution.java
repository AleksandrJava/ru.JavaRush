package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        char space = ' ';

        FileInputStream f = new FileInputStream(args[0]);

        int countSpace = 0;
        int countAll = 0;
        while (f.available() > 0) {
            char s = (char) f.read();
            countAll++;
            if (s == space){
                countSpace++;
            }

        }
        f.close();

        System.out.println(String.format("%.2f", ((float) countSpace / countAll) * 100));
    }
}
