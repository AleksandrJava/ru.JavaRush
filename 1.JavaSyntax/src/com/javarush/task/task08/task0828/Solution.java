package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();

        ArrayList<String> mounth=new ArrayList<>();
        mounth.add("January");  //
        mounth.add("February");
        mounth.add("March");
        mounth.add("April");
        mounth.add("May");
        mounth.add("June");
        mounth.add("July");
        mounth.add("August");
        mounth.add("September");
        mounth.add("October");
        mounth.add("November");
        mounth.add("December");
        int num = 1;

        for (int i=0;i<mounth.size();i++){

            if (month.equals(mounth.get(i))){
                num=num+i;
            }


        }
        System.out.println(month +" is the "+ num +" month");


    }

}
