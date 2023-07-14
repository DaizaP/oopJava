package com.example.oopjava.Seminar5.Lesson5.Ex003Math.Client;

import java.util.Scanner;

import com.example.oopjava.Seminar5.Lesson5.Ex003Math.Core.Views.View;

public class ConsoleView implements View {
    Scanner in = new Scanner(System.in);

    public String get() {
        return in.next();
    };

    @Override
    public void set(String value) {
        System.out.println(value);

    }
}
