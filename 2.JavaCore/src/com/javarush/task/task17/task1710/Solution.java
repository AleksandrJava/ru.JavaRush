package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0])
        {
            case "-c":
                try {
                    createPerson(args[1], args[2], args[3]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "-u":
                updatePerson(Integer.parseInt(args[1]), args[2], args[3], args[4]);
                break;
            case "-d":
                deletePerson(Integer.parseInt(args[1]));
                break;
            case "-i":
                infoOfPerson(Integer.parseInt(args[1]));
                break;
        }
    }

    public static void createPerson(String name, String sex, String date) throws Exception
    {
        Person person;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDay = dateFormat.parse(date);
        switch (sex) {
            case "м":
                person = Person.createMale(name, birthDay);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;
            case "ж":
                person = Person.createFemale(name, birthDay);
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;
        }

    }

    public static void updatePerson(int id, String name, String sex, String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDay = null;
        try {
            birthDay = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        allPeople.get(id).setName(name);
        allPeople.get(id).setSex((sex.equals("м") ? Sex.MALE : Sex.FEMALE));
        allPeople.get(id).setBirthDate(birthDay);

    }

    public static void deletePerson(int id) {
        Person person = allPeople.get(id);
        person.setBirthDate(null);
        person.setName(null);
        person.setSex(null);
        allPeople.set(id, person);
    }

    public static void infoOfPerson(int id) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String sex = (allPeople.get(id).getSex() == Sex.FEMALE) ? "ж" : "м";
        System.out.println(allPeople.get(id).getName() + " " + sex + " " + dateFormat.format(allPeople.get(id).getBirthDate()));
    }
}
