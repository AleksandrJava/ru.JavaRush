package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws Exception {
        String tag = "<" + args[0] ;
        String closeTag = "/" + args[0] + ">";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader2 = new BufferedReader(fileReader);

        String s = "";
        while (reader2.ready()) {
            s += reader2.readLine();
        }
        fileReader.close();
        matchMaker(s, tag, closeTag);
    }

    public static void matchMaker(String input, String tag, String closeTag) {
        Pattern pattern = Pattern.compile("(" + tag + ".*?" + "(("+tag+".*"+closeTag+").*?)*?" + closeTag + ")");
        //Pattern pattern1 = Pattern.compile("<([A-Za-z0-9][A-Za-z0-9\\s]*)[^>]*>.*?</\\1>");
        Matcher matcher = pattern.matcher(input);
        String check;
        while (matcher.find()) {
            check = matcher.group();
            System.out.println(check);
            if (matcher.group(2) != null){
                matchMaker(matcher.group(2), tag, closeTag);
            }
        }

    }
}
