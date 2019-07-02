package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            Scanner breader1 = new Scanner(new File(reader.readLine()));
            Scanner breader2 = new Scanner(new File(reader.readLine()));

            while (breader1.hasNext()) {
                allLines.add(breader1.nextLine());
            }
            while (breader2.hasNext()) {
                forRemoveLines.add(breader2.nextLine());
            }
            reader.close();
            breader1.close();
            breader2.close();

            new Solution().joinData();
        }
        catch (CorruptedDataException exc){}
        catch (IOException exc){}
    }

    public void joinData () throws CorruptedDataException {
        List<String> allLinesBuf = allLines;
        List<String> forRemoveLinesBuf = forRemoveLines;

        if (allLinesBuf.containsAll(forRemoveLinesBuf)){
            allLinesBuf.removeAll(forRemoveLinesBuf);
        }
        else {
            allLinesBuf.retainAll(forRemoveLinesBuf);

            if (allLinesBuf.size() == allLines.size()){
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}
