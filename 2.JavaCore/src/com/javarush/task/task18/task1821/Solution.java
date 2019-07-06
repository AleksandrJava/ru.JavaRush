package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream stream = new FileInputStream(args[0]);

        Map<Character, Integer> map = new TreeMap<>();
        int temp;
        while ((temp = stream.read()) >= 0) {
            map.merge((char) temp, 1, Integer::sum);
        }
        stream.close();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
