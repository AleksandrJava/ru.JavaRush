package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameFile = scanner.nextLine();
        FileInputStream stream = new FileInputStream(nameFile);
        int maxByte = stream.read();
        while(stream.available() > 0){
            int currentByte = stream.read();
            if(currentByte > maxByte) maxByte = currentByte;
        }
        System.out.println(maxByte);
        scanner.close();
        stream.close();
    }
}
