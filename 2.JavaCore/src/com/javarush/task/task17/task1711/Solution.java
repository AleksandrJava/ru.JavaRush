package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0])
        {
            case "-c":

                synchronized (allPeople) {
                    try {
                        for (int i = 1; i < args.length; i += 3) {
                            createPerson(args[i], args[i + 1], args[i + 2]);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        updatePerson(Integer.parseInt(args[i]), args[i + 1], args[i + 2], args[i + 3]);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        deletePerson(Integer.parseInt(args[i]));
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        infoOfPerson(Integer.parseInt(args[i]));
                    }
                    break;
                }
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
