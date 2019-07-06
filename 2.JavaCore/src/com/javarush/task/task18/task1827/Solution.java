package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args){
        if(args.length>0){
            if (args[0].equals("-c")){
                try {
                    Scanner scanner = new Scanner(System.in);
                    String fileName = scanner.nextLine();
                    TreeMap<Integer, String> base = new TreeMap<>();
                    StringBuffer buf;

                    try {
                        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                        while(fileReader.ready()){
                            buf = new StringBuffer(fileReader.readLine());
                            base.put(Integer.parseInt(buf.substring(0,8).trim()),buf.substring(8,42));
                        }
                        fileReader.close();
                    } catch (FileNotFoundException e) {

                    }
                    int maxID = base.size() > 0 ? base.lastKey() + 1 : 0;

                    FileWriter fileWriter = new FileWriter(fileName,true);
                    if (maxID == 0){
                        fileWriter.append(String.format("%-8d%-30s%-8s%-4s",maxID,args[1],args[2],args[3]));
                    } else{
                        fileWriter.append(String.format("%n%-8d%-30.30s%-8.8s%-4.4s",maxID,args[1],args[2],args[3]));
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
