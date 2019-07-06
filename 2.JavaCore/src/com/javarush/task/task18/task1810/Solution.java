package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream stream = new FileInputStream(fileName);
        while(true){
            if(stream.available() >= 1000) {
                fileName = scanner.nextLine();
                stream = new FileInputStream(fileName);
            } else {
                stream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
