package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    private int a;
    private int b;
    private int c;
    private int d;

    protected Solution(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Solution(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Solution(int a) {
        this.a = a;
    }



    public static void main(String[] args) {

    }
}

