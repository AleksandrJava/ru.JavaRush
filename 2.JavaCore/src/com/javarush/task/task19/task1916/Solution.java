package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        String s1;
        String s2;
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        while ((s1 = reader1.readLine()) != null){
            arr1.add(s1);
        }
        while ((s1 = reader2.readLine()) != null){
            arr2.add(s1);
        }

        int i = 0;
        while (arr1.size() > 0){
            s1 = arr1.get(i);
            if (arr2.size() == 0){
                lines.add(new LineItem(Type.REMOVED, s1));
                arr1.remove(i);
            } else {
                s2 = arr2.get(i);
                if (s1.equals(s2)) {
                    lines.add(new LineItem(Type.SAME, s1));
                    arr1.remove(i);
                    arr2.remove(i);
                } else {
                    if (s1.equals(arr2.get(i + 1))){
                        lines.add(new LineItem(Type.ADDED, s2));
                        arr2.remove(i);
                    } else {
                        if (arr1.get(i+1).equals(s2)){
                            lines.add(new LineItem(Type.REMOVED, s1));
                            arr1.remove(i);
                        }
                    }
                }
            }
        }
        if (arr2.size() == 1) lines.add(new LineItem(Type.ADDED, arr2.get(0)));

        reader1.close();
        reader2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
