package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }


    public static void main(String[] args) {
        for (Thread thread: threads) {
            thread.start();
        }
    }

    public static class FirstThread extends Thread{
        @Override
        public void run() {
            while(!isInterrupted()){

            }
        }
    }

    public static class SecondThread extends Thread{
        @Override
        public void run() {
            try{
                while(!isInterrupted()){

                }
                throw new InterruptedException();
            } catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class FourthThread extends Thread implements Message{

        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) ;
        }
    }

    public static class FifthThread extends Thread{
        private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private int sum = 0;

        @Override
        public void run() {
            try {
                String value;
                while (!(value = reader.readLine()).equals("N")) {
                    try {
                        this.sum += Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                    }
                }
            } catch (IOException e) {
            }
            System.out.println(this.sum);
        }
    }
}
