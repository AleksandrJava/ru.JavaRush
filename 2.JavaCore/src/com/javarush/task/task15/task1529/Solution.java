package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("helicopter")){
            result = new Helicopter();
        } else if(str.equals("plane")){
            int k = scanner.nextInt();
            result = new Plane(k);
        }
    }
}
