package com.javarush.task.task14.task1419;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new NullPointerException());
        exceptions.add(new NoSuchFieldException());
        exceptions.add(new NoSuchMethodException());
        exceptions.add(new NoSuchElementException());
        exceptions.add(new SQLException());
        exceptions.add(new SecurityException());
        exceptions.add(new BatchUpdateException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());


    }
}
