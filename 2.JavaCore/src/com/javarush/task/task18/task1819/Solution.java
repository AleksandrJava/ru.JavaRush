package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();

        FileInputStream f1 = new FileInputStream(fileName1);
        FileInputStream f2 = new FileInputStream(fileName2);
        byte[] bytes = new byte[f1.available() + f2.available()];

        while (f1.available() > 0) {
            f1.read(bytes, f2.available(), f1.available());
        }
        while (f2.available() > 0) {
            f2.read(bytes, 0, f2.available());
        }
        f1.close();
        f2.close();
        FileOutputStream fos = new FileOutputStream(fileName1);
        fos.write(bytes);
        fos.close();
    }
}
