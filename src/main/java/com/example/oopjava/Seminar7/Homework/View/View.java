package com.example.oopjava.Seminar7.Homework.View;

import java.util.Scanner;

public class View {
    public Logger logger = new Logger();
    public Notification1 notification1 = new Notification1();
    private Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    public void print(String data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
