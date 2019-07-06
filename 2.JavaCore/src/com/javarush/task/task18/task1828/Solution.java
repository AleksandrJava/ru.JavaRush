package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        if(args.length>0) {
            if (args[0].equals("-d") || args[0].equals("-u")) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    String fileName = scanner.nextLine();

                    StringBuffer b = new StringBuffer();
                    StringBuffer buf;

                    try {
                        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                        while (fileReader.ready()) {
                            buf = new StringBuffer(fileReader.readLine());
                            if (args[0].equals("-d") && args[1].equalsIgnoreCase(buf.substring(0, 8).trim())) {

                            } else if (args[0].equals("-u") && args[1].equalsIgnoreCase(buf.substring(0, 8).trim())) {
                                b.append(buf.substring(0, 8)).append(
                                        String.format("%-30s%-8s%-4s", args[2], args[3], args[4])).append("\r\n");
                            } else {
                                b.append(buf).append("\r\n");
                            }

                        }
                        fileReader.close();
                    } catch (FileNotFoundException e) {

                    }
                    b.replace(b.length() - 2, b.length(), "");
                    FileWriter fileWriter = new FileWriter(fileName);
                    try {
                        fileWriter.append(b);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
