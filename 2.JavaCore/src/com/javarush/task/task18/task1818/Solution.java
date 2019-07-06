package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();

        FileInputStream stream1 = new FileInputStream(name2);
        FileInputStream stream2 = new FileInputStream(name3);
        FileOutputStream stream3 = new FileOutputStream(name1);

        while(stream1.available() > 0){
            int a = stream1.read();
            stream3.write(a);
        }

        while(stream2.available() > 0){
            int a = stream2.read();
            stream3.write(a);
        }

        stream1.close();
        stream2.close();
        stream3.close();
    }
}
