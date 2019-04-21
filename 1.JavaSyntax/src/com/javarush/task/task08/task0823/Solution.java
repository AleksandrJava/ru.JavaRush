package com.javarush.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char [] charArray = s.toCharArray(); // стринг аррей в чар
        charArray[0] = Character.toUpperCase(charArray[0]); // символ в ячейке с индексом 0 получает метод заглавной буквы

        for (int i=0; i < charArray.length - 1; i++)
        {
            if (charArray[i] == ' ') // если встречаешь пробел, тогда
                charArray [i + 1] = Character.toUpperCase(charArray[i + 1]); // переходи в следующюю ячейку и делай ей апперКейс метод
        }
        System.out.println(charArray);
    }


}
