package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String adress = br.readLine();
        String param = adress.substring(adress.indexOf("?") + 1);
        String[] razbivka = param.split("&");
        ArrayList<String> parametres = new ArrayList<>();
        ArrayList<String> znach = new ArrayList<>();
        for (int i = 0; i < razbivka.length; i++){
            if (razbivka[i].contains("=")){
                parametres.add(razbivka[i].substring(0, razbivka[i].lastIndexOf("=")));
                znach.add(razbivka[i].substring(razbivka[i].indexOf("=")+1));
            }
            else {parametres.add(razbivka[i]);
                znach.add(null);
            }

        }
        String result = "";
        for (String s : parametres){
            result = result + s + " ";
        }
        System.out.println(result);
        for (int i = 0; i < parametres.size(); i++){
            if (parametres.get(i).equals("obj")){
                try{
                    alert(Double.parseDouble(znach.get(i)));
                }catch (Exception e){
                    alert(znach.get(i));
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
