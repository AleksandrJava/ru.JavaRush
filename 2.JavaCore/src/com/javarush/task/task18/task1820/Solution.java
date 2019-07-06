package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        FileInputStream streamIn = new FileInputStream(name1);
        FileOutputStream streamOut = new FileOutputStream(name2);

        StringBuilder builder = new StringBuilder();

        while (streamIn.available() > 0) {
            builder.append(Character.toChars(streamIn.read()));
        }
        String[] numbers = builder.toString().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            int digit = Math.round(Float.parseFloat(numbers[i]));
            String str = Integer.toString(digit) + " ";
            streamOut.write(str.getBytes());
        }

        streamIn.close();
        streamOut.close();

    }
}
