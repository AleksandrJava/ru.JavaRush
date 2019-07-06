package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameFile = scanner.nextLine();
        scanner.close();

        int current = 0;
        int max = 0;

        FileInputStream stream = new FileInputStream(nameFile);

        HashMap<Integer,Integer> map = new HashMap<>();

        while (stream.available() > 0){
            int t = stream.read();

            if (map.containsKey(t)){
                current = map.get(t);
                map.put(t, ++current);
            } else
                map.put(t, 1);

            if (max < current) max = current;
        }
        for (Map.Entry<Integer, Integer> s : map.entrySet()){
            if (s.getValue() == max){
                System.out.print(s.getKey() + " ");
            }
        }
        stream.close();
    }
}
