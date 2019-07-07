package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> map = new TreeMap<>();

        while (file.ready()) {
            String s = file.readLine();
            String[] str = s.split(" ");

            String name = str[0];
            Double value = Double.parseDouble(str[1]);

            if(map.containsKey(name)){
                map.replace(name, map.get(name) + value);
            } else {
                map.put(name, value);
            }
        }

        file.close();

        double max = 0;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue() > max){
                max = pair.getValue();
            }
        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if(pair.getValue() == max){
                System.out.println(pair.getKey());
            }
        }
    }
}
