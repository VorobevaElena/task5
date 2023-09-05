package com.example.task;

import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите первое число");
        Scanner x = new Scanner(System.in);
        int x1 = x.nextInt();
        System.out.println("Введите второе число");
        Scanner y = new Scanner(System.in);
        int y1 = y.nextInt();
        System.out.println("Введите математическую функцию");
        Scanner z = new Scanner(System.in);
        String z1 = z.nextLine();
        int rez=0;
        if (z1.equals ("*"))
        { rez=x1*y1; }
        else if (z1.equals ("+"))
        { rez = x1 + y1; }
        else if (z1.equals ("-"))
        {rez = x1 - y1;}
        else if (z1.equals ("/"))
        {rez = x1/y1;}
        else { System.out.println("Ошибка!");return; }
        System.out.println("Результат: "+ rez);
    }

}
