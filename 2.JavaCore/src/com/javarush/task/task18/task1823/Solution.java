package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("exit")) {
                break;
            }

            ReadThread th = new ReadThread(s);
            th.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private byte findedByte;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Byte, Integer> freqMap = new HashMap<>();

            try {
                FileInputStream f = new FileInputStream(fileName);
                while (f.available() > 0) {
                    byte[] buf = new byte[f.available()];
                    f.read(buf);

                    for (byte b : buf) {
                        freqMap.merge( b, 1, Integer::sum);
                    }


                }
                f.close();
            }  catch (IOException e) {
                e.getMessage();
            }

            int max = 0;
            for (Map.Entry<Byte, Integer> pair : freqMap.entrySet()) {
                if (max < pair.getValue()) {
                    findedByte = pair.getKey();
                    max = pair.getValue();
                }
            }

            synchronized (resultMap) {
                resultMap.put(this.fileName, new Integer(this.findedByte));
            }
        }
    }
}
