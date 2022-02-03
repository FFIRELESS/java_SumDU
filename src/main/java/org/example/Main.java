package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static byte b = 42;
    static char c = 'a';
    static short s = 1024;
    static int i = 50000;
    static float f = 5.67f;
    static double d = .1234;

    public static void main(String[] args) {
        lastTask();
    }

    public static void task1() {
        System.out.println((f * b) + (i / c) - (d * s));
    }

    public static void task2() {
        System.out.println((int) (0.5 + b));
        System.out.println((float) (i + b));
        System.out.println((double) (i + b));
    }

    public static void task3() {
        int inc = 6, dec = 10;
        System.out.println(inc++ + inc++ + ++dec);
    }

    public static void task4() {
        System.out.println(1f / 0f);
        System.out.println(-1d / 0d);
    }

    public static void task5() {
        System.out.println(0.0 / 0.0);
        System.out.println((1.0 / 0.0) * 0.0);
    }

    public static void task6() {
        int sideA = 5, sideB = 5;
        System.out.println(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    }

    public static void lastTask() {
        Scanner in = new Scanner(System.in);

        ArrayList<Object> list = new ArrayList<>();

        try {
            System.out.println("Ваш возраст: ");
            list.add(Integer.parseInt(in.nextLine()));

            System.out.println("Ваше имя: ");
            list.add(in.nextLine());

            System.out.println("Ваш пол (\"м\" или \"ж\"): ");
            list.add(in.nextLine());

            System.out.println("Ваш город: ");
            list.add(in.nextLine());

            System.out.println("Ваш адрес: ");
            list.add(in.nextLine());

            System.out.println("Вашу группу: ");
            list.add(in.nextLine());

            System.out.println("Ваш курс");
            list.add(Integer.parseInt(in.nextLine()));

            System.out.println("Ваш факультет:");
            list.add(in.nextLine());

            System.out.println("Answers" + list);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}