package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Массив списков строк
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Строка1");
        list1.add("Строка2");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Строка3");
        list2.add("Строка4");

        ArrayList<String>[] arrayList  = new ArrayList[2];
        arrayList[0]=list1;
        arrayList[1]=list2;
        return arrayList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}