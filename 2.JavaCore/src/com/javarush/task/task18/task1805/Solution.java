package com.javarush.task.task18.task1805;

import java.io.FileInputStream;

import java.util.Scanner;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String filename = reader.nextLine();

        FileInputStream fileInputStream = new FileInputStream(filename);
        TreeSet<Integer> set = new TreeSet<>();

        while (fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }

        fileInputStream.close();

        for (int element : set) {
            System.out.print(element + " ");
        }
    }
}
