package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameFile = scanner.nextLine();
        FileInputStream stream = new FileInputStream(nameFile);
        int minByte = stream.read();
        while(stream.available() > 0){
            int currentByte = stream.read();
            if(currentByte < minByte) minByte = currentByte;
        }
        System.out.println(minByte);
        scanner.close();
        stream.close();
    }
}
