package com.example.oopjava.Seminar5.Homework.Task1.View;

public class Notification1 {
    public void incorrectNumber() {
        System.out.println("Принимаются только целые или дробные числа");
    }

    public void exception(Exception e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
}
