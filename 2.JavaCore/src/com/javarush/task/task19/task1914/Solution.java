package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] res = result.split(" ");
        int answer = 0;
        int a = Integer.parseInt(res[0]);
        int b = Integer.parseInt(res[2]);
        if(res[1].equals("+")){
            answer = a + b;
        } else if(res[1].equals("-")){
            answer = a - b;
        } else if(res[1].equals("*")){
            answer = a * b;
        }

        String s = a + " " + res[1] + " " + b + " = " + answer;

        System.setOut(consoleStream);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

