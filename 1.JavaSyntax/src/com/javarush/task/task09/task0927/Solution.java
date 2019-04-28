package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Asd", new Cat("Asd"));
        map.put("Bsa", new Cat("Bsa"));
        map.put("Dgd", new Cat("Dgd"));
        map.put("rrr", new Cat("rrr"));
        map.put("adad", new Cat("adad"));
        map.put("lll", new Cat("lll"));
        map.put("popo", new Cat("popo"));
        map.put("jjjj", new Cat("jjjj"));
        map.put("tette", new Cat("tette"));
        map.put("svsvs", new Cat("svsvs"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}