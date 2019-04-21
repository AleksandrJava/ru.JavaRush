package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Попов", "Александр");
        map.put("Ширяев", "Валерий");
        map.put("Попова", "Татьяна");
        map.put("Попов", "Дмитрий");
        map.put("Быкова", "Татьяна");
        map.put("Поляков", "Вячеслав");
        map.put("Григорьев", "Сергей");
        map.put("Денисов", "Илья");
        map.put("Панова", "Наталия");
        map.put("Шилова", "Алина");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
