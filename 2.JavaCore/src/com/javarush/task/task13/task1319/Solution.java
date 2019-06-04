package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String path = read.readLine();
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));

        String line;
        while(!(line=read.readLine()).equals("exit")){
            wr.append(line);
            wr.append("\n");
        }
        wr.write("exit");
        wr.close();

    }
}
