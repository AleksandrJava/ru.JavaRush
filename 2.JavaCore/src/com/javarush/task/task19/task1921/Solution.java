package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] arr = line.split(" ");
            int year = Integer.valueOf(arr[arr.length-1]);
            int month = Integer.valueOf(arr[arr.length-2]);
            int day = Integer.valueOf(arr[arr.length-3]);
            StringBuilder sbName = new StringBuilder();
            for (int i = 0; i < arr.length-3; i++){
                sbName.append(arr[i]).append(' ');
            }
            String name = sbName.toString().trim();

            Date date = new GregorianCalendar(year, month-1, day).getTime();

            PEOPLE.add(new Person(name, date));
        }
        fileReader.close();

    }
}
