package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> create() {
        List<List<Integer>> ATM = new ArrayList<>();
        List<Integer> hundred = new ArrayList<>();
        List<Integer> twoHundred = new ArrayList<>();
        List<Integer> fifeHundred = new ArrayList<>();
        List<Integer> thousand = new ArrayList<>();

        ATM.add(hundred);
        ATM.add(twoHundred);
        ATM.add(fifeHundred);
        ATM.add(thousand);
        return ATM;
    }

    public static void full(List<List<Integer>> bank, int count) {
        for (int i = 0; i < count; i++) {
            bank.get(0).add(i);
            bank.get(1).add(i);
            bank.get(2).add(i);
           // bank.get(3).add(i);
        }
        bank.get(3).add(1);
    }

    public static String checking(List<List<Integer>> bank) {
        String s = "мало купюр, надо пополнить";
        for (int i = 0; i < bank.size(); i++) {
            if (bank.get(i).size() < 5) return s;
        }
        return "OK";
    }

    public static int[] getArray() {
        return new int[]{2, 3, 4, 5};
    }

    public static double getSquareOfCircle(int radius) {
        return Math.pow(radius, 2) + Math.PI;
    }

    public static double getSquareOfTriangle(int a, int h) {
        if (a == 0 || h == 0) return 0;
        return a * h / 2;
    }

    public static boolean getSimpleNum(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}