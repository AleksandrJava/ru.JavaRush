package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        int count = 0;
        String str = "";
        FileReader fileReader = new FileReader(name);
        while(fileReader.ready()){
            str += ((char)fileReader.read());
        }
        String[] all = str.split("\\W");
        for (int i = 0; i < all.length; i++) {
            if (all[i].equals("world")) {
                count++;
            }
        }
        System.out.println(count);
        fileReader.close();
    }
}
