package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String hobby;
        private boolean sex;
        private boolean marry;
        private String birthday;

        public Human(String name, int age, String hobby, boolean sex, boolean marry, String birthday) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
            this.sex = sex;
            this.marry = marry;
            this.birthday = birthday;
        }

        public Human(String name, int age, String hobby, boolean sex, boolean marry) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
            this.sex = sex;
            this.marry = marry;
        }

        public Human(String name, int age, String hobby, boolean sex) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
            this.sex = sex;
        }

        public Human(String name, int age, String hobby) {
            this.name = name;
            this.age = age;
            this.hobby = hobby;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(boolean sex, boolean marry) {
            this.sex = sex;
            this.marry = marry;
        }

        public Human(String hobby, boolean sex, boolean marry, String birthday) {
            this.hobby = hobby;
            this.sex = sex;
            this.marry = marry;
            this.birthday = birthday;
        }
    }
}
