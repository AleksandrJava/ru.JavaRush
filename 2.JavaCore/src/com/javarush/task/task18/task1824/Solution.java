package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String nameFile = scanner.nextLine();
            try {
                FileInputStream stream = new FileInputStream(nameFile);
                stream.close();
            } catch (FileNotFoundException e) {
                System.out.println(nameFile);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
