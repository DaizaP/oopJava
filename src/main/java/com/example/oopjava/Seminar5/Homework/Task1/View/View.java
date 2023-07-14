package com.example.oopjava.Seminar5.Homework.Task1.View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }
    public void print(Number data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
