package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name  = reader.readLine();
        reader.close();

        BufferedReader res = new BufferedReader(new FileReader(name));

        String line;
        while((line = res.readLine()) != null) {
            int id = line.indexOf(' ');
            String idString = line.substring(0, id);
            if(idString.equals(args[0])) {
                System.out.println(line);
                break;
            }
        }

        res.close();
    }
}
