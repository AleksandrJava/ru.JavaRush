package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> fileNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String fileName = scanner.nextLine();
            if(!fileName.equals("end")) {
                fileNames.add(fileName);
            } else {
                break;
            }
        }
        scanner.close();

        Collections.sort(fileNames);

        byte[] b = new byte[0];

        for (String fileName: fileNames) {
            FileInputStream fis = new FileInputStream(fileName);

            byte[] newArr = new byte[b.length + fis.available()];
            System.arraycopy(b, 0, newArr, 0, b.length);

            fis.read(newArr, b.length, fis.available());
            b = newArr;
            fis.close();
        }
        int endIndex = fileNames.get(0).lastIndexOf(".");
        String newFileName = fileNames.get(0).substring(0, endIndex);

        FileOutputStream fos = new FileOutputStream(newFileName);
        fos.write(b);
        fos.close();
    }
}
