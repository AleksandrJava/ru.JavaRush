package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        while(bufferedReader.ready()){
            String s = bufferedReader.readLine();
            String[] arr = s.split(" ");
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                String word = arr[i];
                for (String a: words) {
                    if(word.equals(a)){
                        count++;
                    }
                }
                if(count > 2){
                    break;
                }
            }
            if(count == 2){
                for (String a: arr) {
                    System.out.print(a + " ");
                }
                System.out.print("\n");
            }

        }
        bufferedReader.close();
    }
}
