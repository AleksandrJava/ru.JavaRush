package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String s = scanner.readLine();
        FileInputStream stream = new FileInputStream(s);
        while(stream.available() > 0){
            char c = (char)stream.read();
            System.out.print(c);
        }
        scanner.close();
        stream.close();
    }
}