package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream streamIn = new FileInputStream(args[1]);
        FileOutputStream streamOut = new FileOutputStream(args[2]);

        if(args[0].equals("-e")){
            while(streamIn.available() > 0){
                int c = streamIn.read();
                streamOut.write(c+1);
            }
        } else if(args[0].equals("-d")){
            while(streamIn.available() > 0){
                int c = streamIn.read();
                streamOut.write(c-1);
            }
        }
        streamIn.close();
        streamOut.close();
    }
}
